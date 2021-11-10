package example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import example.hrms.entities.concretes.Position;


public interface PositionDao extends JpaRepository<Position, Integer>{
	Position getByPosition(String position);
}
