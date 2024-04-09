/** ************************************************************************
 * Copyright (C) 2022 Mob Army S.R.L. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 * Written by Mob Army <info@wwtelecommunications.com>, 2022 for TELEFONICA
 * CELULAR DE BOLIVIA S.A. (Telecel S.A.) use only.
 * *************************************************************************
 */
package bo.tigo.mob.k8s.getdevices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bo.tigo.mob.k8s.getdevices.dto.ResponseObjectDTO;
import bo.tigo.mob.k8s.getdevices.dto.core.Data;
import bo.tigo.mob.k8s.getdevices.dao.ds1.RQueryDS1Repository;
import bo.tigo.mob.k8s.getdevices.util.config.PropertyCache;
import bo.tigo.mob.k8s.getdevices.util.exception.RepositoryException;

/**
 * ResponseObjectService
 *
 * @author Elio Arias
 * @since 1.0
 */
@Service
public class ResponseObjectService {

	@Autowired
	RQueryDS1Repository repositoryQDS1;

	@Autowired
	PropertyCache propertyCache;

	public ResponseObjectDTO getQueryRecords(Optional<String> sku, Optional<String> stockId,
			Optional<String> identifier, String sessionLogId) throws RepositoryException {
		ResponseObjectDTO responseObject = new ResponseObjectDTO();
		responseObject.setData(new Data());
		responseObject.getData().setDevicesList(repositoryQDS1.getQuery1Records(sku, stockId, identifier));
		return responseObject;
	}

}
