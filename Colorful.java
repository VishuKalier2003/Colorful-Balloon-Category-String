/* Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color 
of the ith balloon... Alice wants the rope to be colorful... She does not want two consecutive balloons to be of 
the same color, so she asks Bob for help... Bob can remove some balloons from the rope to make it colorful... 
You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs 
to remove the ith balloon from the rope... Return the minimum time Bob needs to make the rope colorful...
* Eg 1 : color = "abaac"      neededTime = [1,2,3,4,5]          Output = 3
* Eg 2 : color = "abc"        neededTime = [1,2,4]              Output = 0
* Eg 3 : color = "aabaa"      neededTime = [1,2,4,6,1]          Output = 1 + 1 = 2
*/
import java.util.*;
public class Colorful
{
      public int MinimumCost(String colors, int time[])
      {
            int TotalTime = 0;      //* Variable => O(1)
            for(int i = 0; i < time.length - 1; i++)     //! Comprison => O(N)
            {
                  if(colors.charAt(i) == colors.charAt(i + 1))   // checking adjacent colors...
                  {
                        int least = Math.min(time[i], time[i + 1]);  // Removing the minimum time balloon...
                        TotalTime = TotalTime + least;    // Adding the time...
                  }
            }
            return TotalTime;   // Returning the Total time... 
      }
      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            int x;
            System.out.print("Enter number of balloons on the rope : ");
            x = sc.nextInt();
            String str;
            System.out.print("Enter the string of color : ");
            str = sc.next();
            int color[] = new int[x];
            for(int i = 0; i < color.length; i++)
            {
                  System.out.print("Enter time to remove "+(i+1)+" th balloon : ");
                  color[i] = sc.nextInt();
            }
            Colorful colorful = new Colorful();    // object creation...
            System.out.println("Minimum Time to make Rope Colorful : "+colorful.MinimumCost(str, color));
            sc.close();
      }
}



//! Time Complexity => O(N)
//* Space Complexity => O(1)

/** //? DEDUCTIONS :-
 * ? We check the adjacent colors, and we remove the balloon which takes the least time out of two...
 */

 