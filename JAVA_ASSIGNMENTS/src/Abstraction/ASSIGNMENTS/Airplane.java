package Abstraction.ASSIGNMENTS;

public class Airplane implements Boeing,Airbus,Flight{	
		@Override
		public void takeoff() {			
		}
		@Override
		public void takeDown() {		
		}			
		@Override
		public void no_of_pilots() {// TODO Auto-generated method stub
		}

		@Override
		public void fuel_capacity() {			// TODO Auto-generated method stub
		}

		@Override
		public void passenger_seats() {			// TODO Auto-generated method stub
			}
		@Override
		public void distance_travel() {			// TODO Auto-generated method stub
			}
		@Override
		public void flight_no() {// TODO Auto-generated method stub
			}		// TODO Auto-generated method stub
				public static void main(String[] args) {
					// TODO Auto-generated method stub
		Airplane a1=new Airplane();
		
		a1.flight_no();	
		a1.takeoff();
		a1.takeDown();
		a1.	passenger_seats();	
		a1.distance_travel();
		a1.fuel_capacity();
				}
}
