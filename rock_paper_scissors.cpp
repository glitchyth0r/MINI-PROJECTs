/*The Rock Paper Scissors game is a simple game played between two players.
Each player chooses one of these:

Rock
Paper
Scissors

The winner is decided using these rules:
Rock breaks Scissors → Rock wins
Paper covers Rock → Paper wins
Scissors cuts Paper → Scissors wins
If both players choose the same thing, the match is a tie.
Here are some examples of how the game works:

Example 1
Player: Rock
Computer: Scissors
Rock beats scissors → Player wins

Example 2
Player: Paper
Computer: Scissors
Scissors cuts paper → Computer wins

Example 3
Player: Rock
Computer: Rock
Same choices → It's a tie */

#include <iostream>
#include <cstdlib> // for rand() and srand() //
#include <ctime>   // for time() to seed the random number generator //
#include <string>  // for using string data type //
#include <limits>  // for numeric_limits to handle input errors // when the user enters invalid input, we can clear the error flag and ignore the rest of the input to prevent an infinite loop //

using namespace std;

string getmove(int move)
{
    switch (move)
    {
    case 1:
        return "rock";
    case 2:
        return "paper";
    case 3:
        return "scissors";
    default:
        return "invalid move";
    }
}
// Returns: 1 = player wins, -1 = computer wins, 0 = tie
int get_result(int player_move, int computer_move)
{
    if (player_move == computer_move)
        return 0;
    if ((player_move == 1 && computer_move == 3) ||
        (player_move == 2 && computer_move == 1) ||
        (player_move == 3 && computer_move == 2))
        return 1;
    else
        return -1;
}
int player_choice()
{
    int choice;
    while (true)
    {
        cout << "\nenter your choice :\n";
        cout << "1 for rock\n2 for paper\n3 for scissors\n";
        cout << "0 for exit\n";
        cout << " your choice :";

        if (cin >> choice)
        {
            if (choice >= 0 && choice <= 3)
                return choice;
            else
                cout << "invalid choice ,please try again\n";
        }
        else
        {
            cout << " invalid output, please enter a number\n";
            cin.clear();                                         // clear the error flag //
            cin.ignore(numeric_limits<streamsize>::max(), '\n'); // discard the input // ignore the rest of the input until a newline character is found //
        }
    }
}

int main()
{
    srand(time(0));                                   // seed the random number generator with the current time //
    cout << " welcome to rock paper scissors game\n"; // welcome message //

    while (true)
    {
        int player_move = player_choice();
        if (player_move == 0)
        {
            cout << "thanks for playing! goodbye\n";
            break;
        }
        int computer_move = rand() % 3 + 1; // generate a random move for the computer (1-3) //
        cout << " you chose : " << getmove(player_move) << "\n";
        cout << " computer chose :" << getmove(computer_move) << '\n';

        int result = get_result(player_move, computer_move);
        if (result == 1)
            cout << " you win \n";
        else if (result == -1)
            cout << " computer wins \n";
        else
            cout << " it's a tie \n";
    }
    return 0;
}