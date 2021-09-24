
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
			cars.add(new Car(1, 2019, "BMW", "X6", "https://w0.peakpx.com/wallpaper/277/569/HD-wallpaper-red-chiron-sport-bugatti-car-hypercar-supercar-sports-carbon-new.jpg"));
			cars.add(new Car(2, 20210, "Mercedes", "Benz","https://w0.peakpx.com/wallpaper/127/962/HD-wallpaper-sport-reno-renault-racing-sports-car-rs01.jpg"));
			cars.add(new Car(3, 2021, "Bugati", "GT","https://images.unsplash.com/photo-1441148489547-da3f133be9ae?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=750&q=80"));
			cars.add(new Car(4, 2017, "Range Rover", "LandRover","https://images.unsplash.com/photo-1615228939096-9ead6c74008e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bWVyY2VkZXMlMjBiZW56fGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
			cars.add(new Car(5, 2015, "Chrysler", "300","https://w0.peakpx.com/wallpaper/938/82/HD-wallpaper-mg-e-motion-concept-2017-electric-sports-car-sports-coupe-mg-new-cars.jpg"));
			cars.add(new Car(6, 2020, "Tesla", "Vt","https://w0.peakpx.com/wallpaper/792/292/HD-wallpaper-sports-car-car-rear-view-red.jpg"));
			cars.add(new Car(7, 2019, "Ford", "Fiesta","https://w0.peakpx.com/wallpaper/770/788/HD-wallpaper-ford-mustang-shelby-gt500-2019-blue-sports-car-new-blue-mustang-white-lines-american-sports-cars-ford.jpg"));
			cars.add(new Car(8, 2012, "Chevy", "Equinox","https://images.unsplash.com/photo-1615228939096-9ead6c74008e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bWVyY2VkZXMlMjBiZW56fGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
			cars.add(new Car(9, 2016, "Kia", "Sportage" ,"https://images.unsplash.com/photo-1517153295259-74eb0b416cee?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"));
			cars.add(new Car(10, 2018, "Hyundai", "Santa Fe","https://images.unsplash.com/photo-1541443131876-44b03de101c5?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"));
			
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

