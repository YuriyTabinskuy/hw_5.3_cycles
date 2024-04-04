public class five {
    public static void main(String[] args) {
        int count = 0;
        for (int hour = 0; hour < 24; hour++) {
          for(int minute=0; minute<60; minute++) {
            int firsthour = hour/10;
            int secondhour = hour%10;
            int firstminute = minute/10;
            int secondminute = minute%10;
            if (firsthour ==secondminute && secondhour == firstminute) {
                count++;

            }
          }
           
                }
                System.out.println(count);
            }
        }




