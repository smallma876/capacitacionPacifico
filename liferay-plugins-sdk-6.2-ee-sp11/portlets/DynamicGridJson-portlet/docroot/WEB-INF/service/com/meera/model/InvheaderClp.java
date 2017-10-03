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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.meera.service.ClpSerializer;
import com.meera.service.InvheaderLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author meera
 */
public class InvheaderClp extends BaseModelImpl<Invheader> implements Invheader {
	public InvheaderClp() {
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
	public long getPrimaryKey() {
		return _invId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInvId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _invId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getInvId() {
		return _invId;
	}

	@Override
	public void setInvId(long invId) {
		_invId = invId;

		if (_invheaderRemoteModel != null) {
			try {
				Class<?> clazz = _invheaderRemoteModel.getClass();

				Method method = clazz.getMethod("setInvId", long.class);

				method.invoke(_invheaderRemoteModel, invId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_invheaderRemoteModel != null) {
			try {
				Class<?> clazz = _invheaderRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_invheaderRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAmmount() {
		return _ammount;
	}

	@Override
	public void setAmmount(long ammount) {
		_ammount = ammount;

		if (_invheaderRemoteModel != null) {
			try {
				Class<?> clazz = _invheaderRemoteModel.getClass();

				Method method = clazz.getMethod("setAmmount", long.class);

				method.invoke(_invheaderRemoteModel, ammount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTax() {
		return _tax;
	}

	@Override
	public void setTax(long tax) {
		_tax = tax;

		if (_invheaderRemoteModel != null) {
			try {
				Class<?> clazz = _invheaderRemoteModel.getClass();

				Method method = clazz.getMethod("setTax", long.class);

				method.invoke(_invheaderRemoteModel, tax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotal() {
		return _total;
	}

	@Override
	public void setTotal(long total) {
		_total = total;

		if (_invheaderRemoteModel != null) {
			try {
				Class<?> clazz = _invheaderRemoteModel.getClass();

				Method method = clazz.getMethod("setTotal", long.class);

				method.invoke(_invheaderRemoteModel, total);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNotes() {
		return _notes;
	}

	@Override
	public void setNotes(String notes) {
		_notes = notes;

		if (_invheaderRemoteModel != null) {
			try {
				Class<?> clazz = _invheaderRemoteModel.getClass();

				Method method = clazz.getMethod("setNotes", String.class);

				method.invoke(_invheaderRemoteModel, notes);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getInvheaderRemoteModel() {
		return _invheaderRemoteModel;
	}

	public void setInvheaderRemoteModel(BaseModel<?> invheaderRemoteModel) {
		_invheaderRemoteModel = invheaderRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _invheaderRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_invheaderRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			InvheaderLocalServiceUtil.addInvheader(this);
		}
		else {
			InvheaderLocalServiceUtil.updateInvheader(this);
		}
	}

	@Override
	public Invheader toEscapedModel() {
		return (Invheader)ProxyUtil.newProxyInstance(Invheader.class.getClassLoader(),
			new Class[] { Invheader.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		InvheaderClp clone = new InvheaderClp();

		clone.setInvId(getInvId());
		clone.setName(getName());
		clone.setAmmount(getAmmount());
		clone.setTax(getTax());
		clone.setTotal(getTotal());
		clone.setNotes(getNotes());

		return clone;
	}

	@Override
	public int compareTo(Invheader invheader) {
		long primaryKey = invheader.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InvheaderClp)) {
			return false;
		}

		InvheaderClp invheader = (InvheaderClp)obj;

		long primaryKey = invheader.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{invId=");
		sb.append(getInvId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", ammount=");
		sb.append(getAmmount());
		sb.append(", tax=");
		sb.append(getTax());
		sb.append(", total=");
		sb.append(getTotal());
		sb.append(", notes=");
		sb.append(getNotes());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.meera.model.Invheader");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>invId</column-name><column-value><![CDATA[");
		sb.append(getInvId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ammount</column-name><column-value><![CDATA[");
		sb.append(getAmmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tax</column-name><column-value><![CDATA[");
		sb.append(getTax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>total</column-name><column-value><![CDATA[");
		sb.append(getTotal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>notes</column-name><column-value><![CDATA[");
		sb.append(getNotes());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _invId;
	private String _name;
	private long _ammount;
	private long _tax;
	private long _total;
	private String _notes;
	private BaseModel<?> _invheaderRemoteModel;
	private Class<?> _clpSerializerClass = com.meera.service.ClpSerializer.class;
}