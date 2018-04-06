#!/bin/ksh
main()
{
	while :
	do
		clear
		
		echo "This is a simple Card App. Please select one of the below options to start the game.:"
		echo " "
        echo " ---------------------------------------------------------"
		echo " Please select one of the below options to start the game."
		echo " ---------------------------------------------------------"
		echo " 1. Press '1' to shuffle the Cards"
		echo " 2. Press '2' Deal one single card."
		echo " 3. Press '3' Deal all the cards"
		echo " 0. Press '0' to exit the game."
		echo " "
		echo " Select menu number [0-3]:"
		read line;

	case $line in
		
		1)
			echo " You have selected option to shuffle the Cards."
			echo " ----------------------------------------------"
			java -Xms64m -server -Xmx128m  -cp ./bin com.cardapp.main.CardApp 1 
			break;
			;;
		2)
			echo " You have selected option to Deal for One card."
			echo " ----------------------------------------------"
			java -Xms64m -server -Xmx128m  -cp ./bin com.cardapp.main.CardApp 2 
			break;
			;;
		3)
			echo " You have selected option to Deal all the deck cards."
			echo " ----------------------------------------------------"
			java -Xms64m -server -Xmx128m  -cp ./bin com.cardapp.main.CardApp 3
			break;
			;;
		0)
			clear
			exit
		;;
	esac
	done
}
#start program execution here
trap "main" 2 3 
main

#exit
