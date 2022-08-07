package mockproject.model;

import java.sql.Timestamp;

public class FilmModel {

		private int id;
		private String name;
		private String actors;
		private String producer;
		private int duration;
		private Timestamp created_at;
		private Timestamp update_at;
		
		public FilmModel() {
			super();
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getActors() {
			return actors;
		}

		public String getProducer() {
			return producer;
		}

		public int getDuration() {
			return duration;
		}

		public Timestamp getCreated_at() {
			return created_at;
		}

		public Timestamp getUpdate_at() {
			return update_at;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setActors(String actors) {
			this.actors = actors;
		}

		public void setProducer(String producer) {
			this.producer = producer;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public void setCreated_at(Timestamp created_at) {
			this.created_at = created_at;
		}

		public void setUpdate_at(Timestamp update_at) {
			this.update_at = update_at;
		}
		
		
		
		
		
		
}
