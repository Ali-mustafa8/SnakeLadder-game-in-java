package Assignment;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                String winner = "";
                int board[] = new int[100];// we intilize an array that include all cells on the game board
                // here we write the cells that we get snake or ladder and the other values of the array are zero
                board[4] = 10; // there is a ladder in the 4th cell on the board
                board[9] = 23; //there is a ladder in the 9th cell on the board
                board[17] = -10; //there is a snake in the 17th cell so 17-10=7 we back to the cell 7
                board[20] = 18; //ladder-go to square 38
                board[28] = 56; //ladder-go to square 84
                board[40] = 19; //ladder-go to square 59
                board[51] = 16; //ladder-go to square 67
                board[54] = -20; //snake-back to square 34
                board[62] = -43; //snake-back to square 19
                board[63] = 18; //ladder go to square 81
                board[64] = -4; //snake back to square 60
                board[71] = 20; //ladder go to square 91
                board[87] = -63; //snake back to square 24
                board[93] = -20; //snake back to square 73
                board[97] = -20; //snake back to square 75
                board[99] = -21; //snake back to to square 78
                // other values are zer0
                Scanner input = new Scanner(System.in);
                String playerNames[] = new String[2];
                int playerPosition[] = new int[2];
                playerPosition[0] = 0;
                playerPosition[1] = 0;
                int firstone=0;//this is decide about who start first<have brought this idea from internet>
                int firstone1=1;//this is decide who start first
                System.out.println(" entire your name: ");
                playerNames[0] = input.nextLine();
                if (playerNames[0].length() == 0)
                    playerNames[0] = "player1";
                System.out.println (" first player name is:-------------> " + playerNames[0]+"\n");
                System.out.println(" entire your name: ");
                playerNames[1] = input.nextLine();
                if (playerNames[1].length() == 0)
                    playerNames[1] = "player2";
                System.out.println(" second player name is-------------> " + playerNames[1]+"\n");
                System.out.println("the game is between---> ( "+playerNames[0]+" <=========> "+playerNames[1]+")\n\n");
                boolean enter = true;
                String gobyenntire;
                while (enter == true) {
                    System.out.println(playerNames[0] + " throw the dice to see who start fist. Press 'ENTER'");
                    gobyenntire = input.nextLine();
                    int throw1 = throwTheDice();
                    System.out.println( " you threw-----> " + throw1+"\n");
                    System.out.println(playerNames[1] + " throw the dice to who start first. Press 'ENTER'");
                    gobyenntire = input.nextLine();
                    int throw2 = throwTheDice();
                    System.out.println(  " you threw-----> " + throw2+"\n");
                    if (throw1 == throw2) {
                        System.out.println("You both threw the same number! Let's try again");
                    } else if (throw1 > throw2) {
                        System.out.println(playerNames[0] + " will throw the dice first!\n");
                        firstone=0;
                        firstone1=1;
                        break;
                    } else if (throw2 > throw1) {
                        System.out.println(playerNames[1] + " will throw the dice first!\n");
                        firstone=1;
                        firstone1=0;
                        break;
                    }
                }
                System.out.println("Let's start the game...\n");
                boolean in = true;
                while (in==true) {
                    int thisplayer=firstone;
                    //the value goes back into (thisplayer)

                    System.out.println(playerNames[firstone] + ", you are on square " + playerPosition[thisplayer] + ", press 'ENTER' to roll the dice...");
                    gobyenntire = input.nextLine();
                    int throwing= throwTheDice();
                    System.out.println(playerNames[thisplayer] + ", you rolled a " +throwing);
                    int oldPosition = playerPosition[thisplayer];// this is return value of zero...old postion is zero
                    int total = oldPosition + throwing;
                    // this is will be repeated because of the loop
                    if (total == 4) {
                        System.out.println("--------------> ladder ");
                    } else if (total == 9) {
                        System.out.println("--------------> ladder ");
                    } else if (total == 17) {
                        System.out.println("--------------> snake ");
                    } else if (total == 20) {
                        System.out.println("-------------->ladder");
                    } else if (total == 28) {
                        System.out.println("--------------->ladder");
                    } else if (total == 40) {
                        System.out.println("--------------->ladder");
                    } else if (total == 51) {
                        System.out.println("--------------->ladder");
                    } else if (total == 54) {
                        System.out.println("--------------->snake");
                    } else if (total == 63) {
                        System.out.println("--------------->ladder");
                    } else if (total == 71) {
                        System.out.println("----------------> ladder");
                    } else if (total == 87) {
                        System.out.println("----------------> snake");
                    } else if (total == 93) {
                        System.out.println("---------------->snake");
                    } else if (total == 95) {
                        System.out.println("---------------->snake");
                    } else if (total == 99) {
                        System.out.println("---------------->snake");
                    }

                    if (total > 99) {
                        winner = playerNames[thisplayer];
                        break;
                    }
                    playerPosition[thisplayer] = (total + board[total]);
                    // the value of the total goes inside the board
                    System.out.println(playerNames[thisplayer] + ", you have moved from square " + oldPosition + " and are now on square " + playerPosition[thisplayer]+"\n" );
                    thisplayer =firstone1;
                    System.out.println(playerNames[thisplayer] + ", you are on square " + playerPosition[thisplayer] + ", press 'ENTER' to roll the dice...");
                    gobyenntire = input.nextLine();
                    throwing= throwTheDice();
                    System.out.println(playerNames[thisplayer] + ", you rolled a " + throwing);
                    oldPosition = playerPosition[thisplayer];
                    total = oldPosition + throwing;
                    if (total == 4) {
                        System.out.println("--------------> ladder ");
                    } else if (total == 9) {
                        System.out.println("--------------> ladder ");
                    } else if (total == 17) {
                        System.out.println(" --------------->snake ");
                    } else if (total == 20) {
                        System.out.println("---------------> ladder");
                    } else if (total == 28) {
                        System.out.println("---------------> ladder");
                    } else if (total == 40) {
                        System.out.println("---------------> ladder");
                    } else if (total == 51) {
                        System.out.println("---------------> ladder");
                    } else if (total == 54) {
                        System.out.println("----------------> snake");
                    } else if (total == 63) {
                        System.out.println("----------------> ladder");
                    } else if (total == 71) {
                        System.out.println("----------------> ladder");
                    } else if (total == 87) {
                        System.out.println("----------------> snake");
                    } else if (total == 93) {
                        System.out.println("----------------> snake");
                    } else if (total == 95) {
                        System.out.println("-----------------> snake");
                    } else if (total == 99) {
                        System.out.println("-----------------> snake");
                    }
                    if (total > 99) {
                        winner = playerNames[thisplayer];
                        break;
                    }
                    playerPosition[thisplayer] = (total + board[total]);
                    System.out.println(playerNames[thisplayer] + ", you have moved from square " + oldPosition + "and are now on square " + playerPosition[thisplayer]);
                }
                System.out.println("Congratulations " + winner + " you have won the game!");
            }
            private static int throwTheDice () {
                Random rand = new Random();
                return rand.nextInt(6) + 1;
            }


        }




