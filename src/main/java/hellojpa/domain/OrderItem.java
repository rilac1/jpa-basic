package hellojpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class OrderItem {

	@Id
	@GeneratedValue
	@Column(name = "ORDER_ITEM_ID")
	private Long id;

	@Column(name = "ORDER_ID")
	private Long orderID;

	@Column(name = "ITEM_ID")
	private Long itemID;

	private int orderPrice;
	private int count;
}