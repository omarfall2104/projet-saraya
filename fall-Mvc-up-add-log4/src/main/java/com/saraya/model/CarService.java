
	package com.saraya.model;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;

	import org.springframework.stereotype.Service;


	@Service
	public class CarService {
		private static ArrayList<Car> cars = new ArrayList<Car>();
		private static int count = 10;
		
		static {
			cars.add(new Car(1, 2020, "BMW", "X6", "https://images.unsplash.com/photo-1615228939096-9ead6c74008e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bWVyY2VkZXMlMjBiZW56fGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
			cars.add(new Car(2, 2021, "Mercedes", "Benz","https://images.unsplash.com/photo-1568844293986-8d0400bd4745?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"));
			cars.add(new Car(3, 2022, "Bugati", "GT","https://images.unsplash.com/photo-1441148489547-da3f133be9ae?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=750&q=80"));
			cars.add(new Car(4, 2019, "Range Rover", "LandRover","https://images.unsplash.com/photo-1615228939096-9ead6c74008e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bWVyY2VkZXMlMjBiZW56fGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
			cars.add(new Car(5, 2020, "Chrysler", "300","https://sf2.lesderapages.com/wp-content/uploads/sites/14/2016/12/la-rolls-royce-white-ghost-limited-740x410.png"));
			cars.add(new Car(6, 2018, "Tesla", "Vt","https://images.unsplash.com/photo-1566857518676-8c6f180365f4?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"));
			cars.add(new Car(7, 2016, "Ford", "Fiesta","https://images.unsplash.com/photo-1537799531649-ddc9fa5499eb?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=375&q=80"));
			cars.add(new Car(8, 2021, "Chevy", "Equinox","https://images.unsplash.com/photo-1615228939096-9ead6c74008e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bWVyY2VkZXMlMjBiZW56fGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
			cars.add(new Car(9, 2022, "Kia", "Sportage" ,"https://images.unsplash.com/photo-1517153295259-74eb0b416cee?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"));
			cars.add(new Car(10, 2020, "Hyundai", "Santa Fe","https://images.unsplash.com/photo-1541443131876-44b03de101c5?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"));
			
		}
		
		public List<Car> getAllCars(){
			return cars;
		}
		
		public void addCar(int year, String make, String model, String image) {
			cars.add(new Car(++count, year, make, model, image));
		}
		
		public void removeCar(int id) {
			Iterator<Car> tounkara = cars.iterator();
			while(tounkara.hasNext()) {
			
				Car car = tounkara.next();
				if(car.getId() == id) {
					tounkara.remove();
				}
			}
		}
		public Car findById(int id) {
			for(Car car : cars) {
				if(car.getId() == id) {
					return car;
				}
			}
			return null;
		}

		public void updateCar(Car car) {
			cars.remove(car);
			cars.add(car);
		}
		
			
			
		
		
	
		
		
	}

