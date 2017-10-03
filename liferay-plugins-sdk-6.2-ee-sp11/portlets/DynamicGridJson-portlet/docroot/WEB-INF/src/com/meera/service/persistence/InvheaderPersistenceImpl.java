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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.meera.NoSuchInvheaderException;

import com.meera.model.Invheader;
import com.meera.model.impl.InvheaderImpl;
import com.meera.model.impl.InvheaderModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the invheader service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author meera
 * @see InvheaderPersistence
 * @see InvheaderUtil
 * @generated
 */
public class InvheaderPersistenceImpl extends BasePersistenceImpl<Invheader>
	implements InvheaderPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InvheaderUtil} to access the invheader persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InvheaderImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InvheaderModelImpl.ENTITY_CACHE_ENABLED,
			InvheaderModelImpl.FINDER_CACHE_ENABLED, InvheaderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InvheaderModelImpl.ENTITY_CACHE_ENABLED,
			InvheaderModelImpl.FINDER_CACHE_ENABLED, InvheaderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InvheaderModelImpl.ENTITY_CACHE_ENABLED,
			InvheaderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public InvheaderPersistenceImpl() {
		setModelClass(Invheader.class);
	}

	/**
	 * Caches the invheader in the entity cache if it is enabled.
	 *
	 * @param invheader the invheader
	 */
	@Override
	public void cacheResult(Invheader invheader) {
		EntityCacheUtil.putResult(InvheaderModelImpl.ENTITY_CACHE_ENABLED,
			InvheaderImpl.class, invheader.getPrimaryKey(), invheader);

		invheader.resetOriginalValues();
	}

	/**
	 * Caches the invheaders in the entity cache if it is enabled.
	 *
	 * @param invheaders the invheaders
	 */
	@Override
	public void cacheResult(List<Invheader> invheaders) {
		for (Invheader invheader : invheaders) {
			if (EntityCacheUtil.getResult(
						InvheaderModelImpl.ENTITY_CACHE_ENABLED,
						InvheaderImpl.class, invheader.getPrimaryKey()) == null) {
				cacheResult(invheader);
			}
			else {
				invheader.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all invheaders.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InvheaderImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InvheaderImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the invheader.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Invheader invheader) {
		EntityCacheUtil.removeResult(InvheaderModelImpl.ENTITY_CACHE_ENABLED,
			InvheaderImpl.class, invheader.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Invheader> invheaders) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Invheader invheader : invheaders) {
			EntityCacheUtil.removeResult(InvheaderModelImpl.ENTITY_CACHE_ENABLED,
				InvheaderImpl.class, invheader.getPrimaryKey());
		}
	}

	/**
	 * Creates a new invheader with the primary key. Does not add the invheader to the database.
	 *
	 * @param invId the primary key for the new invheader
	 * @return the new invheader
	 */
	@Override
	public Invheader create(long invId) {
		Invheader invheader = new InvheaderImpl();

		invheader.setNew(true);
		invheader.setPrimaryKey(invId);

		return invheader;
	}

	/**
	 * Removes the invheader with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param invId the primary key of the invheader
	 * @return the invheader that was removed
	 * @throws com.meera.NoSuchInvheaderException if a invheader with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Invheader remove(long invId)
		throws NoSuchInvheaderException, SystemException {
		return remove((Serializable)invId);
	}

	/**
	 * Removes the invheader with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the invheader
	 * @return the invheader that was removed
	 * @throws com.meera.NoSuchInvheaderException if a invheader with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Invheader remove(Serializable primaryKey)
		throws NoSuchInvheaderException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Invheader invheader = (Invheader)session.get(InvheaderImpl.class,
					primaryKey);

			if (invheader == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInvheaderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(invheader);
		}
		catch (NoSuchInvheaderException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Invheader removeImpl(Invheader invheader)
		throws SystemException {
		invheader = toUnwrappedModel(invheader);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(invheader)) {
				invheader = (Invheader)session.get(InvheaderImpl.class,
						invheader.getPrimaryKeyObj());
			}

			if (invheader != null) {
				session.delete(invheader);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (invheader != null) {
			clearCache(invheader);
		}

		return invheader;
	}

	@Override
	public Invheader updateImpl(com.meera.model.Invheader invheader)
		throws SystemException {
		invheader = toUnwrappedModel(invheader);

		boolean isNew = invheader.isNew();

		Session session = null;

		try {
			session = openSession();

			if (invheader.isNew()) {
				session.save(invheader);

				invheader.setNew(false);
			}
			else {
				session.merge(invheader);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(InvheaderModelImpl.ENTITY_CACHE_ENABLED,
			InvheaderImpl.class, invheader.getPrimaryKey(), invheader);

		return invheader;
	}

	protected Invheader toUnwrappedModel(Invheader invheader) {
		if (invheader instanceof InvheaderImpl) {
			return invheader;
		}

		InvheaderImpl invheaderImpl = new InvheaderImpl();

		invheaderImpl.setNew(invheader.isNew());
		invheaderImpl.setPrimaryKey(invheader.getPrimaryKey());

		invheaderImpl.setInvId(invheader.getInvId());
		invheaderImpl.setName(invheader.getName());
		invheaderImpl.setAmmount(invheader.getAmmount());
		invheaderImpl.setTax(invheader.getTax());
		invheaderImpl.setTotal(invheader.getTotal());
		invheaderImpl.setNotes(invheader.getNotes());

		return invheaderImpl;
	}

	/**
	 * Returns the invheader with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the invheader
	 * @return the invheader
	 * @throws com.meera.NoSuchInvheaderException if a invheader with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Invheader findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInvheaderException, SystemException {
		Invheader invheader = fetchByPrimaryKey(primaryKey);

		if (invheader == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInvheaderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return invheader;
	}

	/**
	 * Returns the invheader with the primary key or throws a {@link com.meera.NoSuchInvheaderException} if it could not be found.
	 *
	 * @param invId the primary key of the invheader
	 * @return the invheader
	 * @throws com.meera.NoSuchInvheaderException if a invheader with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Invheader findByPrimaryKey(long invId)
		throws NoSuchInvheaderException, SystemException {
		return findByPrimaryKey((Serializable)invId);
	}

	/**
	 * Returns the invheader with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the invheader
	 * @return the invheader, or <code>null</code> if a invheader with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Invheader fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Invheader invheader = (Invheader)EntityCacheUtil.getResult(InvheaderModelImpl.ENTITY_CACHE_ENABLED,
				InvheaderImpl.class, primaryKey);

		if (invheader == _nullInvheader) {
			return null;
		}

		if (invheader == null) {
			Session session = null;

			try {
				session = openSession();

				invheader = (Invheader)session.get(InvheaderImpl.class,
						primaryKey);

				if (invheader != null) {
					cacheResult(invheader);
				}
				else {
					EntityCacheUtil.putResult(InvheaderModelImpl.ENTITY_CACHE_ENABLED,
						InvheaderImpl.class, primaryKey, _nullInvheader);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InvheaderModelImpl.ENTITY_CACHE_ENABLED,
					InvheaderImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return invheader;
	}

	/**
	 * Returns the invheader with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param invId the primary key of the invheader
	 * @return the invheader, or <code>null</code> if a invheader with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Invheader fetchByPrimaryKey(long invId) throws SystemException {
		return fetchByPrimaryKey((Serializable)invId);
	}

	/**
	 * Returns all the invheaders.
	 *
	 * @return the invheaders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Invheader> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Invheader> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Invheader> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Invheader> list = (List<Invheader>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INVHEADER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INVHEADER;

				if (pagination) {
					sql = sql.concat(InvheaderModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Invheader>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Invheader>(list);
				}
				else {
					list = (List<Invheader>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the invheaders from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Invheader invheader : findAll()) {
			remove(invheader);
		}
	}

	/**
	 * Returns the number of invheaders.
	 *
	 * @return the number of invheaders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_INVHEADER);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the invheader persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.meera.model.Invheader")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Invheader>> listenersList = new ArrayList<ModelListener<Invheader>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Invheader>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(InvheaderImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INVHEADER = "SELECT invheader FROM Invheader invheader";
	private static final String _SQL_COUNT_INVHEADER = "SELECT COUNT(invheader) FROM Invheader invheader";
	private static final String _ORDER_BY_ENTITY_ALIAS = "invheader.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Invheader exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InvheaderPersistenceImpl.class);
	private static Invheader _nullInvheader = new InvheaderImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Invheader> toCacheModel() {
				return _nullInvheaderCacheModel;
			}
		};

	private static CacheModel<Invheader> _nullInvheaderCacheModel = new CacheModel<Invheader>() {
			@Override
			public Invheader toEntityModel() {
				return _nullInvheader;
			}
		};
}