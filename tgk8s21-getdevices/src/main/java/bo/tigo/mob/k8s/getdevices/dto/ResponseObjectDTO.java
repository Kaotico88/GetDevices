/** ************************************************************************
 * Copyright (C) 2022 Mob Army S.R.L. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 * Written by Mob Army <info@wwtelecommunications.com>, 2022 for TELEFONICA
 * CELULAR DE BOLIVIA S.A. (Telecel S.A.) use only.
 * *************************************************************************
 */
package bo.tigo.mob.k8s.getdevices.dto;

import bo.tigo.mob.k8s.getdevices.dto.core.Data;

/**
 * ResponseObject
 *
 * @author Elio Arias
 * @since 1.0
 */
public class ResponseObjectDTO {
	
	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseObjectDTO [\n + " + 
					"\tdata=" + data + " \n" +
					"]";
	}
	
	
}
