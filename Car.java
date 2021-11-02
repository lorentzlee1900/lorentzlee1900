/** 
 * Car.java
 * @author: Zhan Li
 * @verison 4.2.7
 * @date 10/10/2021
 * CS 501
 * CCI
 * Drexel University
 * */
/**
     * Car class
     * 
     * data
     * 
     * -carId: int
     * -originalValue: double
     * -years: int
     * -listedValue: double
     * -expectedValue: double
     * 
     * ==============================
     * 
     *  Methods
     * 
     * + Car()
     * + setOriginalValue(double o) : void
     * + setYears(int y) : void
     * + setListedValue(doubel l): void
     * + getExpectedValue() : double
     * + getNotification() : String
     * + toString() : String
     * 
     **/

 class Car{
        private int carId;
        private double originalValue;
        private int years;
        private double listedValue;
        private double expectedValue;

        public Car() {
            
            carId = 0;
            originalValue = 0.00;
            years = 0;
            listedValue = 0.00;
            expectedValue = 0.00;

        }

        public Car(int c, double o, int y, double l, double e){
            carId = c;
            originalValue = o;
            years = y;
            listedValue = l;
            expectedValue = e;
          }

        public void setOriginalValue (double o){

            originalValue = o;
        }

        public void setYears (int y){

            years = y;
        }

        public void setListedValue (double l){

            listedValue = l;
        }

        
        public double getExpectedValue(){

            double expectedValue = originalValue * (1 - ((years * 0.05)));

            return expectedValue;
        }
        

        public String getNotification(){
            String recom;
            if (expectedValue >= listedValue)
                recom = "This is a good deal since the expected value is higher than listed value";

            else
                recom = "This is a bad deal since the expected value is lower than listed value";

            return recom;

        }

        public String toString(){

            return ("Car ID: " + carId + "\n" + "Original Value: " + originalValue + "\n" + "Used years number: " + years + "\n" + "Listed value: " + listedValue + "\n" + "Expected value: " + expectedValue);

        }



     }