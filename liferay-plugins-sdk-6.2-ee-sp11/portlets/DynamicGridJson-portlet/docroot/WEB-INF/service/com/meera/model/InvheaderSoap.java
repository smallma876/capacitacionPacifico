/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.meera.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.meera.service.http.InvheaderServiceSoap}.
 *
 * @author meera
 * @see com.meera.service.http.InvheaderServiceSoap
 * @generated
 */
public class InvheaderSoap implements Serializable {
	public static InvheaderSoap toSoapModel(Invheader model) {
		InvheaderSoap soapModel = new InvheaderSoap();

		soapModel.setInvId(model.getInvId());
		soapModel.setName(model.getName());
		soapModel.setAmmount(model.getAmmount());
		soapModel.setTax(model.getTax());
		soapModel.setTotal(model.getTotal());
		soapModel.setNotes(model.getNotes());

		return soapModel;
	}

	public static InvheaderSoap[] toSoapModels(Invheader[] models) {
		InvheaderSoap[] soapModels = new InvheaderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InvheaderSoap[][] toSoapModels(Invheader[][] models) {
		InvheaderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InvheaderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InvheaderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InvheaderSoap[] toSoapModels(List<Invheader> models) {
		List<InvheaderSoap> soapModels = new ArrayList<InvheaderSoap>(models.size());

		for (Invheader model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InvheaderSoap[soapModels.size()]);
	}

	public InvheaderSoap() {
	}

	public long getPrimaryKey() {
		return _invId;
	}

	public void setPrimaryKey(long pk) {
		setInvId(pk);
	}

	public long getInvId() {
		return _invId;
	}

	public void setInvId(long invId) {
		_invId = invId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public long getAmmount() {
		return _ammount;
	}

	public void setAmmount(long ammount) {
		_ammount = ammount;
	}

	public long getTax() {
		return _tax;
	}

	public void setTax(long tax) {
		_tax = tax;
	}

	public long getTotal() {
		return _total;
	}

	public void setTotal(long total) {
		_total = total;
	}

	public String getNotes() {
		return _notes;
	}

	public void setNotes(String notes) {
		_notes = notes;
	}

	private long _invId;
	private String _name;
	private long _ammount;
	private long _tax;
	private long _total;
	private String _notes;
}