package com.saraya.model;

import javax.validation.constraints.Size;

public class Car {
	
		private int id;
		private int year;
		@Size(min = 4, message= "Enter at leat 4 letters")
		//String description;
		private String make;
		private String model;
		private String image;
		public Car(int id, int year, String make, String model, String image) {
			super();
			this.id = id;
			this.year = year;
			this.make = make;
			this.model = model;
			this.image = image;
		}
		public Car() {
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Car other = (Car) obj;
			if (id != other.id)
				return false;
			return true;
		}
		@Override
		public String toString() {
			return String.format("Car [id=%s, year=%s, make=%s, model=%s, image=%s]", id, year, make, model, image);
		}
		
		
		
	}


