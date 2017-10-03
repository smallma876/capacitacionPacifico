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

package com.meera.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InvheaderLocalService}.
 *
 * @author meera
 * @see InvheaderLocalService
 * @generated
 */
public class InvheaderLocalServiceWrapper implements InvheaderLocalService,
	ServiceWrapper<InvheaderLocalService> {
	public InvheaderLocalServiceWrapper(
		InvheaderLocalService invheaderLocalService) {
		_invheaderLocalService = invheaderLocalService;
	}

	/**
	* Adds the invheader to the database. Also notifies the appropriate model listeners.
	*
	* @param invheader the invheader
	* @return the invheader that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.model.Invheader addInvheader(
		com.meera.model.Invheader invheader)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.addInvheader(invheader);
	}

	/**
	* Creates a new invheader with the primary key. Does not add the invheader to the database.
	*
	* @param invId the primary key for the new invheader
	* @return the new invheader
	*/
	@Override
	public com.meera.model.Invheader createInvheader(long invId) {
		return _invheaderLocalService.createInvheader(invId);
	}

	/**
	* Deletes the invheader with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param invId the primary key of the invheader
	* @return the invheader that was removed
	* @throws PortalException if a invheader with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.model.Invheader deleteInvheader(long invId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.deleteInvheader(invId);
	}

	/**
	* Deletes the invheader from the database. Also notifies the appropriate model listeners.
	*
	* @param invheader the invheader
	* @return the invheader that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.model.Invheader deleteInvheader(
		com.meera.model.Invheader invheader)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.deleteInvheader(invheader);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _invheaderLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.model.impl.InvheaderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.model.impl.InvheaderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.meera.model.Invheader fetchInvheader(long invId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.fetchInvheader(invId);
	}

	/**
	* Returns the invheader with the primary key.
	*
	* @param invId the primary key of the invheader
	* @return the invheader
	* @throws PortalException if a invheader with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.model.Invheader getInvheader(long invId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.getInvheader(invId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.meera.model.Invheader> getInvheaders(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.getInvheaders(start, end);
	}

	/**
	* Returns the number of invheaders.
	*
	* @return the number of invheaders
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getInvheadersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.getInvheadersCount();
	}

	/**
	* Updates the invheader in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param invheader the invheader
	* @return the invheader that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.model.Invheader updateInvheader(
		com.meera.model.Invheader invheader)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _invheaderLocalService.updateInvheader(invheader);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _invheaderLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_invheaderLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _invheaderLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InvheaderLocalService getWrappedInvheaderLocalService() {
		return _invheaderLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInvheaderLocalService(
		InvheaderLocalService invheaderLocalService) {
		_invheaderLocalService = invheaderLocalService;
	}

	@Override
	public InvheaderLocalService getWrappedService() {
		return _invheaderLocalService;
	}

	@Override
	public void setWrappedService(InvheaderLocalService invheaderLocalService) {
		_invheaderLocalService = invheaderLocalService;
	}

	private InvheaderLocalService _invheaderLocalService;
}