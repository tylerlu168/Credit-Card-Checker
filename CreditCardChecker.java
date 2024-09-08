public class CreditCardChecker
{
    /**
     * Static method which checks is a certain credit card is valid
     *
     * Precondition: Must input an integer cardNumber to run this method
     *
     * @param cardNumber
     * @return returns a boolean (true or false) to check if the credit card number is valid
     */
    public static boolean check(int cardNumber)
    {
        int cardNumber2 = cardNumber;// assigns cardNumber's value to a different integer variable to separate two processes


        int output = 0; // creation of output1

        while(cardNumber != 0) // process 1
        {
            output += (cardNumber % 10); //1st output
            cardNumber /= 10;
            cardNumber /= 10;
        }

        int output2 = 0; // creation of output2
        int assign = 0;

        while(cardNumber2 != 0)
        {
            cardNumber2 /= 10;
            assign = ((cardNumber2  % 10) * 2);
            while(assign != 0) // splits number up and adds integer values to output2
            {
                output2 += (assign % 10);
                assign /= 10;
            }
            cardNumber2 /= 10;
        }
        int finalOutput = output + output2; // combines outputs of the two different processes

        if((finalOutput % 10) == 0)
        {
            return true; // returns true if rightmost digit is 0
        }
        else
        {
            return false; // returns false if rightmost digit is not 0
        }
    }
}
