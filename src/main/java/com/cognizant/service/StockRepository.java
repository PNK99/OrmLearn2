package com.cognizant.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.modal.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

	@Query("SELECT stock FROM Stock stock  WHERE MONTH(stock.date) = 9 AND YEAR(stock.date) = 2019")
	public List<Stock> getSeptemberStocks();

	@Query("SELECT stock FROM Stock stock WHERE stock.code = 'GOOGL' AND stock.close > 1250")
	public List<Stock> getGoogleStocksGt1250();

	@Query("SELECT stock FROM Stock stock ORDER BY stock.volume DESC")
	public List<Stock> getHighestVolumeStocks(Pageable pageable);

	@Query("SELECT stock FROM Stock stock WHERE stock.code='NFLX' ORDER BY stock.volume")
	public List<Stock> getLowestVolumeNetflixStocks(Pageable pageable);

}
