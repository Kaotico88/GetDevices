/** ************************************************************************
 * Copyright (C) 2022 Mob Army S.R.L. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 * Written by Mob Army <info@wwtelecommunications.com>, 2022 for TELEFONICA
 * CELULAR DE BOLIVIA S.A. (Telecel S.A.) use only.
 * *************************************************************************
 */
package bo.tigo.mob.k8s.getdevices;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import bo.tigo.mob.k8s.getdevices.dto.ResponseObjectDTO;
import bo.tigo.mob.k8s.getdevices.dto.core.Data;
import bo.tigo.mob.k8s.getdevices.dto.core.DevicesList;
import bo.tigo.mob.k8s.getdevices.dto.core.Stock;

/**
 * Tgk8s21GetdevicesApplicationTests
 *
 * @author Elio Arias
 * @since 1.0
 */
@SpringBootTest
class Tgk8s21GetdevicesApplicationTests {
		
	public ResponseObjectDTO object;
	
	public Data data;
	
	public DevicesList devList;
	
	public Stock stock;
	
    @Test
    void contextLoads() {
    	object = new ResponseObjectDTO();
    	data = new Data();
    	devList = new DevicesList();
    	List<DevicesList> devLists = new ArrayList<DevicesList>();
    	stock = new Stock();
    		
    	String sku = "71100690250";
    	String stockId = "417";
    	String identifier = "352798296826483";
    	
    	stock.setStockId("417");
    	stock.setName("Dep. Equipos SAC Regional SCZ");
    	stock.setStockType("warehouse");
    	devList.setId("71100690256_352798296826483");
    	devList.setSku(sku);
    	devList.setIdentifier("352798296826483");
    	devList.setSerialNumber("352798296986683");
    	devList.setLifecycleStatus("delivered");
    	devList.setPrimaryId("71100690256_352798296986683");
    	devList.setCategory("mobile");
    	devList.setStock(stock);
    	
    	devLists.add(devList);
    	
    	data.setDevicesList(devLists);
    	
    	object.setData(data);
    	
    	System.out.println(object + " \n");
    }

}
