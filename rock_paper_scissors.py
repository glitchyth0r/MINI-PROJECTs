#The Rock Paper Scissors game is a simple game played between two players.
#Each player chooses one of these:

#Rock
#Paper
#Scissors

#The winner is decided using these rules:
#Rock breaks Scissors → Rock wins
#Paper covers Rock → Paper wins
#Scissors cuts Paper → Scissors wins
#If both players choose the same thing, the match is a tie.
#Here are some examples of how the game works:
#Example 1
#Player: Rock
#Computer: Scissors
#Rock beats scissors → Player wins

#Example 2
#Player: Paper
#Computer: Scissors
#Scissors cuts paper → Computer wins

#Example 3
#Player: Rock
#Computer: Rock
#Same choices → Tie


choices = ["rock", "paper", "scissors"]#List of possible choices for the game
import random#Importing the random module to generate a random choice for the computer

computer_choice = random.choice(choices)#Randomly selecting a choice for the computer from the list of choices
user_choice = input("enter rock,paper or scissors:").lower()#Taking input from the user and converting it to lowercase to ensure consistency in comparison

print("computer choice:", computer_choice)

if user_choice == computer_choice:#Checking if the user's choice is the same as the computer's choice to determine if it's a tie
    print("It's a tie!")
elif (
    (user_choice == "rock" and computer_choice == "scissors")#Checking the winning conditions for the user based on the rules of the game
    or (user_choice == "paper" and computer_choice == "rock")
    or (user_choice == "scissors" and computer_choice == "paper")
):
    print("You win!")
elif user_choice in choices:#Checking if the user's choice is valid and if the computer wins based on the rules of the game
    print("Computer wins!")
else:
    print("Invalid choice. Please choose rock, paper, or scissors.")#Handling the case where the user enters an invalid choice that is not in the list of valid choices
