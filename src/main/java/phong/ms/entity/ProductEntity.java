package phong.ms.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Product")
@Data
public class ProductEntity {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;
	@Column
	private String category;
	@Column
	private BigDecimal price;
}
