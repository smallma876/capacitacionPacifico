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

package com.meera.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.meera.model.Invheader;

/**
 * The persistence interface for the invheader service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author meera
 * @see InvheaderPersistenceImpl
 * @see InvheaderUtil
 * @generated
 */
public interface InvheaderPersistence extends BasePersistence<Invheader> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InvheaderUtil} to access the invheader persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the invheader in the entity cache if it is enabled.
	*
	* @param invheader the invheader
	*/
	public void cacheResult(com.meera.model.Invheader invheader);

	/**
	* Caches the invheaders in the entity cache if it is enabled.
	*
	* @param invheaders the invheaders
	*/
	public void cacheResult(
		java.util.List<com.meera.model.Invheader> invheaders);

	/**
	* Creates a new invheader with the primary key. Does not add the invheader to the database.
	*
	* @param invId the primary key for the new invheader
	* @return the new invheader
	*/
	public com.meera.model.Invheader create(long invId);

	/**
	* Removes the invheader with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param invId the primary key of the invheader
	* @return the invheader that was removed
	* @throws com.meera.NoSuchInvheaderException if a invheader with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.model.Invheader remove(long invId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.NoSuchInvheaderException;

	public com.meera.model.Invheader updateImpl(
		com.meera.model.Invheader invheader)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the invheader with the primary key or throws a {@link com.meera.NoSuchInvheaderException} if it could not be found.
	*
	* @param invId the primary key of the invheader
	* @return the invheader
	* @throws com.meera.NoSuchInvheaderException if a invheader with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.model.Invheader findByPrimaryKey(long invId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.NoSuchInvheaderException;

	/**
	* Returns the invheader with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param invId the primary key of the invheader
	* @return the invheader, or <code>null</code> if a invheader with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.model.Invheader fetchByPrimaryKey(long invId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the invheaders.
	*
	* @return the invheaders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.model.Invheader> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the invheaders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.model.impl.InvheaderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of invheaders
	* @param end the upper bound of the range of invheaders (not inclusive)
	* @return the range of invheaders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.model.Invheader> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the invheaders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.model.impl.InvheaderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of invheaders
	* @param end the upper bound of the range of invheaders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of invheaders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.model.Invheader> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the invheaders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of invheaders.
	*
	* @return the number of invheaders
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}