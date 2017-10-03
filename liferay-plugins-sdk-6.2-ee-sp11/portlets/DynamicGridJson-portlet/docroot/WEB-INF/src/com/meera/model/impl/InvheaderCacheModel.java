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

package com.meera.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.meera.model.Invheader;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Invheader in entity cache.
 *
 * @author meera
 * @see Invheader
 * @generated
 */
public class InvheaderCacheModel implements CacheModel<Invheader>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{invId=");
		sb.append(invId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", ammount=");
		sb.append(ammount);
		sb.append(", tax=");
		sb.append(tax);
		sb.append(", total=");
		sb.append(total);
		sb.append(", notes=");
		sb.append(notes);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Invheader toEntityModel() {
		InvheaderImpl invheaderImpl = new InvheaderImpl();

		invheaderImpl.setInvId(invId);

		if (name == null) {
			invheaderImpl.setName(StringPool.BLANK);
		}
		else {
			invheaderImpl.setName(name);
		}

		invheaderImpl.setAmmount(ammount);
		invheaderImpl.setTax(tax);
		invheaderImpl.setTotal(total);

		if (notes == null) {
			invheaderImpl.setNotes(StringPool.BLANK);
		}
		else {
			invheaderImpl.setNotes(notes);
		}

		invheaderImpl.resetOriginalValues();

		return invheaderImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		invId = objectInput.readLong();
		name = objectInput.readUTF();
		ammount = objectInput.readLong();
		tax = objectInput.readLong();
		total = objectInput.readLong();
		notes = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(invId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(ammount);
		objectOutput.writeLong(tax);
		objectOutput.writeLong(total);

		if (notes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(notes);
		}
	}

	public long invId;
	public String name;
	public long ammount;
	public long tax;
	public long total;
	public String notes;
}