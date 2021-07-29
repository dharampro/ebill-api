package com.techendear.ebill.party;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
//	public Page<Customer> findAll(Pageable pageable);
}
