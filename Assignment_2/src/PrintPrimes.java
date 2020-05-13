/** *****************************************************
* Finds and prints n prime integers
********************************************************* */

public class PrintPrimes
{
	
   //Empty Constructor
   public PrintPrimes(){}

   private boolean isDivisible (int i, int j)
   {
      if (j%i == 0)
         return true;
      else
         return false;
   }
   
   
   public int[] printPrimes (int n, boolean showAll)
   {
      int curPrime;           // Value currently considered for primeness
      int numPrimes;          // Number of primes found so far.
      boolean isPrime;        // Is curPrime prime?
      int [] primes = new int [100]; // The list of prime number candidates.
    
      // Initialize 2 into the list of primes.
      primes [0] = 2;
      numPrimes = 1;
      curPrime  = 2;
      while (numPrimes < n)
      {
         curPrime++;  // next number to consider ...
         isPrime = true;
         for (int i = 0; i <= numPrimes - 1; i++)
         {   // for each previous prime.
            if (isDivisible (primes[i], curPrime))
            {  // Found a divisor, curPrime is not prime.
               isPrime = false;
               break; // out of loop through primes.
            }
         }
         if (isPrime)
         {   // save it!
            primes[numPrimes] = curPrime;
            numPrimes++;
         }
      }  // End while
   
      // Add prime(s) to final output array (flag dependent).
      int[] listOfPrimes = new int[numPrimes];
	  if(showAll){
		  
		int count = 0;
		for (int thisPrime: primes)
		{
			if(thisPrime != 0) { 
				// Add primes to final array up to index "numPrimes - 1"
				listOfPrimes[count++] = thisPrime;
			}
			else { break; }
		}
	  }
	  else {
		  listOfPrimes = new int[1];
		  listOfPrimes[0] = primes[numPrimes - 1];
	  }
	  
	  return listOfPrimes;
   }  // end printPrimes
   
}
