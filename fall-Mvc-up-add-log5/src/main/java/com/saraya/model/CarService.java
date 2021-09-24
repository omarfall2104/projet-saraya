
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
			cars.add(new Car(1, 2019, "BMW", "X6", "https://www.automobile-propre.com/wp-content/uploads/2017/07/polaris-bruxelles.jpg\r\n"));
			cars.add(new Car(2, 2020, "Mercedes", "Benz","https://static.actu.fr/uploads/2019/11/20190926_101548.jpg"));
			cars.add(new Car(3, 2017, "Bugati", "GT","https://www.lamontagne.fr/photoSRC/Gw--/teste-bus-electrique-libeo_4369524.jpeg"));
			cars.add(new Car(4, 2018, "Range Rover", "LandRover","https://cdn.pixabay.com/photo/2013/07/13/10/16/mobile-home-156914_960_720.png"));
			cars.add(new Car(5, 2012, "Chrysler", "300","https://cdn.pixabay.com/photo/2018/03/07/16/07/coach-3206326_960_720.png"));
			cars.add(new Car(6, 20121, "Chevy", "Vt","https://images.freeimages.com/images/large-previews/cf9/bus-1449252.jpg"));
			cars.add(new Car(7, 2019, "Ford", "Fiesta","https://images.freeimages.com/images/large-previews/fec/bus-1449740.jpg"));
			cars.add(new Car(8, 2019, "Tesla", "Equinox","https://images.freeimages.com/images/large-previews/44e/van-1449061.jpg"));
			cars.add(new Car(9, 2020, "Kia", "Sportage" ,"https://images.freeimages.com/images/large-previews/c23/school-bus-with-child-1431211.jpg"));
			cars.add(new Car(10, 20219, "Hyundai", "Santa Fe","https://images.freeimages.com/images/large-previews/aef/school-bus-1431472.jpg"));
			
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

