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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Invheader}.
 * </p>
 *
 * @author meera
 * @see Invheader
 * @generated
 */
public class InvheaderWrapper implements Invheader, ModelWrapper<Invheader> {
	public InvheaderWrapper(Invheader invheader) {
		_invheader = invheader;
	}

	@Override
	public Class<?> getModelClass() {
		return Invheader.class;
	}

	@Override
	public String getModelClassName() {
		return Invheader.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("invId", getInvId());
		attributes.put("name", getName());
		attributes.put("ammount", getAmmount());
		attributes.put("tax", getTax());
		attributes.put("total", getTotal());
		attributes.put("notes", getNotes());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long invId = (Long)attributes.get("invId");

		if (invId != null) {
			setInvId(invId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long ammount = (Long)attributes.get("ammount");

		if (ammount != null) {
			setAmmount(ammount);
		}

		Long tax = (Long)attributes.get("tax");

		if (tax != null) {
			setTax(tax);
		}

		Long total = (Long)attributes.get("total");

		if (total != null) {
			setTotal(total);
		}

		String notes = (String)attributes.get("notes");

		if (notes != null) {
			setNotes(notes);
		}
	}

	/**
	* Returns the primary key of this invheader.
	*
	* @return the primary key of this invheader
	*/
	@Override
	public long getPrimaryKey() {
		return _invheader.getPrimaryKey();
	}

	/**
	* Sets the primary key of this invheader.
	*
	* @param primaryKey the primary key of this invheader
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_invheader.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the inv ID of this invheader.
	*
	* @return the inv ID of this invheader
	*/
	@Override
	public long getInvId() {
		return _invheader.getInvId();
	}

	/**
	* Sets the inv ID of this invheader.
	*
	* @param invId the inv ID of this invheader
	*/
	@Override
	public void setInvId(long invId) {
		_invheader.setInvId(invId);
	}

	/**
	* Returns the name of this invheader.
	*
	* @return the name of this invheader
	*/
	@Override
	public java.lang.String getName() {
		return _invheader.getName();
	}

	/**
	* Sets the name of this invheader.
	*
	* @param name the name of this invheader
	*/
	@Override
	public void setName(java.lang.String name) {
		_invheader.setName(name);
	}

	/**
	* Returns the ammount of this invheader.
	*
	* @return the ammount of this invheader
	*/
	@Override
	public long getAmmount() {
		return _invheader.getAmmount();
	}

	/**
	* Sets the ammount of this invheader.
	*
	* @param ammount the ammount of this invheader
	*/
	@Override
	public void setAmmount(long ammount) {
		_invheader.setAmmount(ammount);
	}

	/**
	* Returns the tax of this invheader.
	*
	* @return the tax of this invheader
	*/
	@Override
	public long getTax() {
		return _invheader.getTax();
	}

	/**
	* Sets the tax of this invheader.
	*
	* @param tax the tax of this invheader
	*/
	@Override
	public void setTax(long tax) {
		_invheader.setTax(tax);
	}

	/**
	* Returns the total of this invheader.
	*
	* @return the total of this invheader
	*/
	@Override
	public long getTotal() {
		return _invheader.getTotal();
	}

	/**
	* Sets the total of this invheader.
	*
	* @param total the total of this invheader
	*/
	@Override
	public void setTotal(long total) {
		_invheader.setTotal(total);
	}

	/**
	* Returns the notes of this invheader.
	*
	* @return the notes of this invheader
	*/
	@Override
	public java.lang.String getNotes() {
		return _invheader.getNotes();
	}

	/**
	* Sets the notes of this invheader.
	*
	* @param notes the notes of this invheader
	*/
	@Override
	public void setNotes(java.lang.String notes) {
		_invheader.setNotes(notes);
	}

	@Override
	public boolean isNew() {
		return _invheader.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_invheader.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _invheader.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_invheader.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _invheader.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _invheader.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_invheader.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _invheader.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_invheader.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_invheader.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_invheader.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InvheaderWrapper((Invheader)_invheader.clone());
	}

	@Override
	public int compareTo(com.meera.model.Invheader invheader) {
		return _invheader.compareTo(invheader);
	}

	@Override
	public int hashCode() {
		return _invheader.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.meera.model.Invheader> toCacheModel() {
		return _invheader.toCacheModel();
	}

	@Override
	public com.meera.model.Invheader toEscapedModel() {
		return new InvheaderWrapper(_invheader.toEscapedModel());
	}

	@Override
	public com.meera.model.Invheader toUnescapedModel() {
		return new InvheaderWrapper(_invheader.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _invheader.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _invheader.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_invheader.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InvheaderWrapper)) {
			return false;
		}

		InvheaderWrapper invheaderWrapper = (InvheaderWrapper)obj;

		if (Validator.equals(_invheader, invheaderWrapper._invheader)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Invheader getWrappedInvheader() {
		return _invheader;
	}

	@Override
	public Invheader getWrappedModel() {
		return _invheader;
	}

	@Override
	public void resetOriginalValues() {
		_invheader.resetOriginalValues();
	}

	private Invheader _invheader;
}