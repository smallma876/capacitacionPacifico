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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.meera.model.Invheader;

import java.util.List;

/**
 * The persistence utility for the invheader service. This utility wraps {@link InvheaderPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author meera
 * @see InvheaderPersistence
 * @see InvheaderPersistenceImpl
 * @generated
 */
public class InvheaderUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Invheader invheader) {
		getPersistence().clearCache(invheader);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Invheader> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Invheader> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Invheader> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Invheader update(Invheader invheader)
		throws SystemException {
		return getPersistence().update(invheader);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Invheader update(Invheader invheader,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(invheader, serviceContext);
	}

	/**
	* Caches the invheader in the entity cache if it is enabled.
	*
	* @param invheader the invheader
	*/
	public static void cacheResult(com.meera.model.Invheader invheader) {
		getPersistence().cacheResult(invheader);
	}

	/**
	* Caches the invheaders in the entity cache if it is enabled.
	*
	* @param invheaders the invheaders
	*/
	public static void cacheResult(
		java.util.List<com.meera.model.Invheader> invheaders) {
		getPersistence().cacheResult(invheaders);
	}

	/**
	* Creates a new invheader with the primary key. Does not add the invheader to the database.
	*
	* @param invId the primary key for the new invheader
	* @return the new invheader
	*/
	public static com.meera.model.Invheader create(long invId) {
		return getPersistence().create(invId);
	}

	/**
	* Removes the invheader with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param invId the primary key of the invheader
	* @return the invheader that was removed
	* @throws com.meera.NoSuchInvheaderException if a invheader with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.model.Invheader remove(long invId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.NoSuchInvheaderException {
		return getPersistence().remove(invId);
	}

	public static com.meera.model.Invheader updateImpl(
		com.meera.model.Invheader invheader)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(invheader);
	}

	/**
	* Returns the invheader with the primary key or throws a {@link com.meera.NoSuchInvheaderException} if it could not be found.
	*
	* @param invId the primary key of the invheader
	* @return the invheader
	* @throws com.meera.NoSuchInvheaderException if a invheader with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.model.Invheader findByPrimaryKey(long invId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.NoSuchInvheaderException {
		return getPersistence().findByPrimaryKey(invId);
	}

	/**
	* Returns the invheader with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param invId the primary key of the invheader
	* @return the invheader, or <code>null</code> if a invheader with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.model.Invheader fetchByPrimaryKey(long invId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(invId);
	}

	/**
	* Returns all the invheaders.
	*
	* @return the invheaders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.model.Invheader> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.meera.model.Invheader> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.meera.model.Invheader> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the invheaders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of invheaders.
	*
	* @return the number of invheaders
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static InvheaderPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (InvheaderPersistence)PortletBeanLocatorUtil.locate(com.meera.service.ClpSerializer.getServletContextName(),
					InvheaderPersistence.class.getName());

			ReferenceRegistry.registerReference(InvheaderUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(InvheaderPersistence persistence) {
	}

	private static InvheaderPersistence _persistence;
}