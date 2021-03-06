/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.expando.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.expando.model.ExpandoColumn;
import com.liferay.portlet.expando.model.ExpandoColumnConstants;
import com.liferay.portlet.expando.model.ExpandoRow;
import com.liferay.portlet.expando.model.ExpandoTable;
import com.liferay.portlet.expando.model.ExpandoTableConstants;
import com.liferay.portlet.expando.model.ExpandoValue;
import com.liferay.portlet.expando.model.impl.ExpandoValueImpl;
import com.liferay.portlet.expando.service.base.ExpandoValueLocalServiceBaseImpl;

import java.io.Serializable;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Raymond Augé
 * @author Brian Wing Shun Chan
 * @author Marcellus Tavares
 */
public class ExpandoValueLocalServiceImpl
	extends ExpandoValueLocalServiceBaseImpl {

	public ExpandoValue addValue(
			long classNameId, long tableId, long columnId, long classPK,
			String data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTablePersistence.findByPrimaryKey(tableId);

		return doAddValue(
			table.getCompanyId(), classNameId, tableId, columnId, classPK,
			data);
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, boolean data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setBoolean(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, boolean[] data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setBooleanArray(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, Date data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setDate(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, Date[] data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setDateArray(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, double data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setDouble(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, double[] data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setDoubleArray(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, float data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setFloat(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, float[] data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setFloatArray(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, int data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setInteger(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, int[] data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setIntegerArray(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, long data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setLong(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, long[] data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setLongArray(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, Number data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setNumber(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, Number[] data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setNumberArray(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, Object data)
		throws PortalException, SystemException {

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			companyId, className, tableName, columnName);

		int type = column.getType();

		if (type == ExpandoColumnConstants.BOOLEAN) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				((Boolean)data).booleanValue());
		}
		else if (type == ExpandoColumnConstants.BOOLEAN_ARRAY) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				(boolean[])data);
		}
		else if (type == ExpandoColumnConstants.DATE) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				(Date)data);
		}
		else if (type == ExpandoColumnConstants.DATE_ARRAY) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				(Date[])data);
		}
		else if (type == ExpandoColumnConstants.DOUBLE) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				((Double)data).doubleValue());
		}
		else if (type == ExpandoColumnConstants.DOUBLE_ARRAY) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				(double[])data);
		}
		else if (type == ExpandoColumnConstants.FLOAT) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				((Float)data).floatValue());
		}
		else if (type == ExpandoColumnConstants.FLOAT_ARRAY) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				(float[])data);
		}
		else if (type == ExpandoColumnConstants.INTEGER) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				((Integer)data).intValue());
		}
		else if (type == ExpandoColumnConstants.INTEGER_ARRAY) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				(int[])data);
		}
		else if (type == ExpandoColumnConstants.LONG) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				((Long)data).longValue());
		}
		else if (type == ExpandoColumnConstants.LONG_ARRAY) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				(long[])data);
		}
		else if (type == ExpandoColumnConstants.NUMBER) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				(Number)data);
		}
		else if (type == ExpandoColumnConstants.NUMBER_ARRAY) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				(Number[])data);
		}
		else if (type == ExpandoColumnConstants.SHORT) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				((Short)data).shortValue());
		}
		else if (type == ExpandoColumnConstants.SHORT_ARRAY) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				(short[])data);
		}
		else if (type == ExpandoColumnConstants.STRING_ARRAY) {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				(String[])data);
		}
		else {
			return expandoValueLocalService.addValue(
				companyId, className, tableName, columnName, classPK,
				(String)data);
		}
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, short data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setShort(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, short[] data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setShortArray(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, String data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setString(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	public ExpandoValue addValue(
			long companyId, String className, String tableName,
			String columnName, long classPK, String[] data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, className, tableName);

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			table.getTableId(), columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(table.getCompanyId());
		value.setColumnId(column.getColumnId());
		value.setStringArray(data);

		return expandoValueLocalService.addValue(
			table.getClassNameId(), table.getTableId(), column.getColumnId(),
			classPK, value.getData());
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long,
	 *             boolean[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			boolean data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long,
	 *             boolean[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			boolean[] data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long, Date[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			Date data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long, Date[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			Date[] data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long,
	 *             double[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			double data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long,
	 *             double[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			double[] data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long,
	 *             float[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			float data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long,
	 *             float[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			float[] data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long, int[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			int data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long, int[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			int[] data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long, long[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			long data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long, long[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			long[] data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long, Object)}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			Object data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long,
	 *             short[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			short data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long,
	 *             short[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			short[] data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long,
	 *             String[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			String data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	/**
	 * @deprecated {@link #addValue(long, String, String, String, long,
	 *             String[])}
	 */
	public ExpandoValue addValue(
			String className, String tableName, String columnName, long classPK,
			String[] data)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.addValue(
			companyId, className, tableName, columnName, classPK, data);
	}

	public void addValues(
			long classNameId, long tableId, List<ExpandoColumn> columns,
			long classPK, Map<String, String> data)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTablePersistence.findByPrimaryKey(tableId);

		ExpandoRow row = expandoRowPersistence.fetchByT_C(tableId, classPK);

		if (row == null) {
			long rowId = counterLocalService.increment();

			row = expandoRowPersistence.create(rowId);

			row.setCompanyId(table.getCompanyId());
			row.setTableId(tableId);
			row.setClassPK(classPK);

			expandoRowPersistence.update(row, false);
		}

		for (ExpandoColumn column : columns) {
			String dataString = data.get(column.getName());

			if (dataString == null) {
				continue;
			}

			ExpandoValue value = expandoValuePersistence.fetchByC_R(
				column.getColumnId(), row.getRowId());

			if (value == null) {
				long valueId = counterLocalService.increment();

				value = expandoValuePersistence.create(valueId);

				value.setCompanyId(table.getCompanyId());
				value.setTableId(tableId);
				value.setColumnId(column.getColumnId());
				value.setRowId(row.getRowId());
				value.setClassNameId(classNameId);
				value.setClassPK(classPK);
			}

			value.setData(dataString);

			expandoValuePersistence.update(value, false);
		}
	}

	public void addValues(
			long companyId, long classNameId, String tableName, long classPK,
			Map<String, Serializable> attributes)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTableLocalService.getTable(
			companyId, classNameId, tableName);

		List<ExpandoColumn> columns = expandoColumnLocalService.getColumns(
			table.getTableId(), attributes.keySet());

		ExpandoValue value = new ExpandoValueImpl();

		value.setCompanyId(companyId);

		for (ExpandoColumn column : columns) {
			Serializable attributeValue = attributes.get(column.getName());

			value.setColumn(column);

			int type = column.getType();

			if (type == ExpandoColumnConstants.BOOLEAN) {
				value.setBoolean((Boolean)attributeValue);
			}
			else if (type == ExpandoColumnConstants.BOOLEAN_ARRAY) {
				value.setBooleanArray((boolean[])attributeValue);
			}
			else if (type == ExpandoColumnConstants.DATE) {
				value.setDate((Date)attributeValue);
			}
			else if (type == ExpandoColumnConstants.DATE_ARRAY) {
				value.setDateArray((Date[])attributeValue);
			}
			else if (type == ExpandoColumnConstants.DOUBLE) {
				value.setDouble((Double)attributeValue);
			}
			else if (type == ExpandoColumnConstants.DOUBLE_ARRAY) {
				value.setDoubleArray((double[])attributeValue);
			}
			else if (type == ExpandoColumnConstants.FLOAT) {
				value.setFloat((Float)attributeValue);
			}
			else if (type == ExpandoColumnConstants.FLOAT_ARRAY) {
				value.setFloatArray((float[])attributeValue);
			}
			else if (type == ExpandoColumnConstants.INTEGER) {
				value.setInteger((Integer)attributeValue);
			}
			else if (type == ExpandoColumnConstants.INTEGER_ARRAY) {
				value.setIntegerArray((int[])attributeValue);
			}
			else if (type == ExpandoColumnConstants.LONG) {
				value.setLong((Long)attributeValue);
			}
			else if (type == ExpandoColumnConstants.LONG_ARRAY) {
				value.setLongArray((long[])attributeValue);
			}
			else if (type == ExpandoColumnConstants.SHORT) {
				value.setShort((Short)attributeValue);
			}
			else if (type == ExpandoColumnConstants.SHORT_ARRAY) {
				value.setShortArray((short[])attributeValue);
			}
			else if (type == ExpandoColumnConstants.STRING_ARRAY) {
				value.setStringArray((String[])attributeValue);
			}
			else {
				value.setString((String)attributeValue);
			}

			doAddValue(
				companyId, classNameId, table.getTableId(),
				column.getColumnId(), classPK, value.getData());
		}
	}

	public void addValues(
			long companyId, String className, String tableName, long classPK,
			Map<String, Serializable> attributes)
		throws PortalException, SystemException {

		long classNameId = PortalUtil.getClassNameId(className);

		addValues(companyId, classNameId, tableName, classPK, attributes);
	}

	public void deleteColumnValues(long columnId) throws SystemException {
		List<ExpandoValue> values = expandoValuePersistence.findByColumnId(
			columnId);

		for (ExpandoValue value : values) {
			deleteValue(value);
		}
	}

	public void deleteRowValues(long rowId) throws SystemException {
		List<ExpandoValue> values = expandoValuePersistence.findByRowId(rowId);

		for (ExpandoValue value : values) {
			deleteValue(value);
		}
	}

	public void deleteTableValues(long tableId) throws SystemException {
		List<ExpandoValue> values = expandoValuePersistence.findByTableId(
			tableId);

		for (ExpandoValue value : values) {
			deleteValue(value);
		}
	}

	public void deleteValue(ExpandoValue value) throws SystemException {
		expandoValuePersistence.remove(value);
	}

	public void deleteValue(long valueId)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValuePersistence.findByPrimaryKey(valueId);

		deleteValue(value);
	}

	public void deleteValue(long columnId, long rowId)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValuePersistence.findByC_R(columnId, rowId);

		deleteValue(value);
	}

	public void deleteValue(
			long companyId, long classNameId, String tableName,
			String columnName, long classPK)
		throws PortalException, SystemException {

		ExpandoTable table = expandoTablePersistence.fetchByC_C_N(
			companyId, classNameId, tableName);

		if (table == null) {
			return;
		}

		List<ExpandoColumn> columns = expandoColumnPersistence.findByT_N(
			table.getTableId(), columnName);

		if (columns.isEmpty()) {
			return;
		}

		ExpandoColumn column = columns.get(0);

		ExpandoValue value = expandoValuePersistence.fetchByT_C_C(
			table.getTableId(), column.getColumnId(), classPK);

		if (value != null) {
			deleteValue(value.getValueId());
		}
	}

	public void deleteValue(
			long companyId, String className, String tableName,
			String columnName, long classPK)
		throws PortalException, SystemException {

		long classNameId = PortalUtil.getClassNameId(className);

		expandoValueLocalService.deleteValue(
			companyId, classNameId, tableName, columnName, classPK);
	}

	public void deleteValues(long classNameId, long classPK)
		throws SystemException {

		List<ExpandoValue> values = expandoValuePersistence.findByC_C(
			classNameId, classPK);

		for (ExpandoValue value : values) {
			deleteValue(value);
		}
	}

	public void deleteValues(String className, long classPK)
		throws SystemException {

		long classNameId = PortalUtil.getClassNameId(className);

		expandoValueLocalService.deleteValues(classNameId, classPK);
	}

	public List<ExpandoValue> getColumnValues(long columnId, int start, int end)
		throws SystemException {

		return expandoValuePersistence.findByColumnId(columnId, start, end);
	}

	public List<ExpandoValue> getColumnValues(
			long companyId, long classNameId, String tableName,
			String columnName, int start, int end)
		throws SystemException {

		return expandoValueLocalService.getColumnValues(
			companyId, classNameId, tableName, columnName, null, start, end);
	}

	public List<ExpandoValue> getColumnValues(
			long companyId, long classNameId, String tableName,
			String columnName, String data, int start, int end)
		throws SystemException {

		ExpandoTable table = expandoTablePersistence.fetchByC_C_N(
			companyId, classNameId, tableName);

		if (table == null) {
			return Collections.emptyList();
		}

		List<ExpandoColumn> columns = expandoColumnPersistence.findByT_N(
			table.getTableId(), columnName);

		if (columns.isEmpty()) {
			return Collections.emptyList();
		}

		ExpandoColumn column = columns.get(0);

		if (data == null) {
			return expandoValuePersistence.findByT_C(
				table.getTableId(), column.getColumnId(), start, end);
		}
		else {
			return expandoValuePersistence.findByT_C_D(
				table.getTableId(), column.getColumnId(), data, start, end);
		}
	}

	public List<ExpandoValue> getColumnValues(
			long companyId, String className, String tableName,
			String columnName, int start, int end)
		throws SystemException {

		long classNameId = PortalUtil.getClassNameId(className);

		return expandoValueLocalService.getColumnValues(
			companyId, classNameId, tableName, columnName, start, end);
	}

	public List<ExpandoValue> getColumnValues(
			long companyId, String className, String tableName,
			String columnName, String data, int start, int end)
		throws SystemException {

		long classNameId = PortalUtil.getClassNameId(className);

		return expandoValueLocalService.getColumnValues(
			companyId, classNameId, tableName, columnName, data, start, end);
	}

	/**
	 * @deprecated {@link #getColumnValues(long, String, String, String, String,
	 *             int, int)}
	 */
	public List<ExpandoValue> getColumnValues(
			String className, String tableName, String columnName, String data,
			int start, int end)
		throws SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getColumnValues(
			companyId, className, tableName, columnName, data, start, end);
	}

	public int getColumnValuesCount(long columnId) throws SystemException {
		return expandoValuePersistence.countByColumnId(columnId);
	}

	public int getColumnValuesCount(
			long companyId, long classNameId, String tableName,
			String columnName)
		throws SystemException {

		return expandoValueLocalService.getColumnValuesCount(
			companyId, classNameId, tableName, columnName, null);
	}

	public int getColumnValuesCount(
			long companyId, long classNameId, String tableName,
			String columnName, String data)
		throws SystemException {

		ExpandoTable table = expandoTablePersistence.fetchByC_C_N(
			companyId, classNameId, tableName);

		if (table == null) {
			return 0;
		}

		List<ExpandoColumn> columns = expandoColumnPersistence.findByT_N(
			table.getTableId(), columnName);

		if (columns.isEmpty()) {
			return 0;
		}

		ExpandoColumn column = columns.get(0);

		if (data == null) {
			return expandoValuePersistence.countByT_C(
				table.getTableId(), column.getColumnId());
		}
		else {
			return expandoValuePersistence.countByT_C_D(
				table.getTableId(), column.getColumnId(), data);
		}
	}

	public int getColumnValuesCount(
			long companyId, String className, String tableName,
			String columnName)
		throws SystemException {

		long classNameId = PortalUtil.getClassNameId(className);

		return expandoValueLocalService.getColumnValuesCount(
			companyId, classNameId, tableName, columnName);
	}

	public int getColumnValuesCount(
			long companyId, String className, String tableName,
			String columnName, String data)
		throws SystemException {

		long classNameId = PortalUtil.getClassNameId(className);

		return expandoValueLocalService.getColumnValuesCount(
			companyId, classNameId, tableName, columnName, data);
	}

	/**
	 * @deprecated {@link #getColumnValuesCount(long, String, String, String,
	 *             String)}
	 */
	public int getColumnValuesCount(
			String className, String tableName, String columnName, String data)
		throws SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getColumnValuesCount(
			companyId, className, tableName, columnName, data);
	}

	public Map<String, Serializable> getData(
			long companyId, String className, String tableName,
			Collection<String> columnNames, long classPK)
		throws PortalException, SystemException {

		List<ExpandoColumn> columns = expandoColumnLocalService.getColumns(
			companyId, className, tableName, columnNames);

		Map<String, Serializable> attributeValues =
			new HashMap<String, Serializable>((int)(columnNames.size() * 1.4));

		ExpandoValue value = new ExpandoValueImpl();

		for (ExpandoColumn column : columns) {
			value.setColumn(column);
			value.setData(column.getDefaultData());

			Serializable attributeValue = doGetData(
				companyId, className, tableName, column.getName(),
				classPK, value, column.getType());

			attributeValues.put(column.getName(), attributeValue);
		}

		return attributeValues;
	}

	public Serializable getData(
			long companyId, String className, String tableName,
			String columnName, long classPK)
		throws PortalException, SystemException {

		ExpandoColumn column = expandoColumnLocalService.getColumn(
			companyId, className, tableName, columnName);

		ExpandoValue value = new ExpandoValueImpl();

		value.setColumn(column);
		value.setData(column.getDefaultData());

		return doGetData(
			companyId, className, tableName, columnName, classPK, value,
			column.getType());
	}

	public boolean getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, boolean defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getBoolean();
		}
	}

	public boolean[] getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, boolean[] defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getBooleanArray();
		}
	}

	public Date getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, Date defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getDate();
		}
	}

	public Date[] getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, Date[] defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getDateArray();
		}
	}

	public double getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, double defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getDouble();
		}
	}

	public double[] getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, double[] defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getDoubleArray();
		}
	}

	public float getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, float defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getFloat();
		}
	}

	public float[] getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, float[] defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getFloatArray();
		}
	}

	public int getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, int defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getInteger();
		}
	}

	public int[] getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, int[] defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getIntegerArray();
		}
	}

	public long getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, long defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getLong();
		}
	}

	public long[] getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, long[] defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getLongArray();
		}
	}

	public short getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, short defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getShort();
		}
	}

	public short[] getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, short[] defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getShortArray();
		}
	}

	public String getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, String defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getString();
		}
	}

	public String[] getData(
			long companyId, String className, String tableName,
			String columnName, long classPK, String[] defaultData)
		throws PortalException, SystemException {

		ExpandoValue value = expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);

		if (value == null) {
			return defaultData;
		}
		else {
			return value.getStringArray();
		}
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long)}
	 */
	public Serializable getData(
			String className, String tableName, String columnName, long classPK)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long,
	 *             boolean[])}
	 */
	public boolean getData(
			String className, String tableName, String columnName, long classPK,
			boolean defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long,
	 *             boolean[])}
	 */
	public boolean[] getData(
			String className, String tableName, String columnName, long classPK,
			boolean[] defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long, Date[])}
	 */
	public Date getData(
			String className, String tableName, String columnName, long classPK,
			Date defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long, Date[])}
	 */
	public Date[] getData(
			String className, String tableName, String columnName, long classPK,
			Date[] defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long,
	 *             double[])}
	 */
	public double getData(
			String className, String tableName, String columnName, long classPK,
			double defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long,
	 *             double[])}
	 */
	public double[] getData(
			String className, String tableName, String columnName, long classPK,
			double[] defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long, float[])}
	 */
	public float getData(
			String className, String tableName, String columnName, long classPK,
			float defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long, float[])}
	 */
	public float[] getData(
			String className, String tableName, String columnName, long classPK,
			float[] defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long, int[])}
	 */
	public int getData(
			String className, String tableName, String columnName, long classPK,
			int defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long, int[])}
	 */
	public int[] getData(
			String className, String tableName, String columnName, long classPK,
			int[] defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long, long[])}
	 */
	public long getData(
			String className, String tableName, String columnName, long classPK,
			long defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long, long[])}
	 */
	public long[] getData(
			String className, String tableName, String columnName, long classPK,
			long[] defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long, short[])}
	 */
	public short getData(
			String className, String tableName, String columnName, long classPK,
			short defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long, short[])}
	 */
	public short[] getData(
			String className, String tableName, String columnName, long classPK,
			short[] defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long,
	 *             String[])}
	 */
	public String getData(
			String className, String tableName, String columnName, long classPK,
			String defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	/**
	 * @deprecated {@link #getData(long, String, String, String, long,
	 *             String[])}
	 */
	public String[] getData(
			String className, String tableName, String columnName, long classPK,
			String[] defaultData)
		throws PortalException, SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getData(
			companyId, className, tableName, columnName, classPK, defaultData);
	}

	public List<ExpandoValue> getDefaultTableColumnValues(
			long companyId, long classNameId, String columnName, int start,
			int end)
		throws SystemException {

		return expandoValueLocalService.getColumnValues(
			companyId, classNameId, ExpandoTableConstants.DEFAULT_TABLE_NAME,
			columnName, start, end);
	}

	public List<ExpandoValue> getDefaultTableColumnValues(
			long companyId, String className, String columnName, int start,
			int end)
		throws SystemException {

		long classNameId = PortalUtil.getClassNameId(className);

		return expandoValueLocalService.getDefaultTableColumnValues(
			companyId, classNameId, columnName, start, end);
	}

	public int getDefaultTableColumnValuesCount(
			long companyId, long classNameId, String columnName)
		throws SystemException {

		return expandoValueLocalService.getColumnValuesCount(
			companyId, classNameId, ExpandoTableConstants.DEFAULT_TABLE_NAME,
			columnName);
	}

	public int getDefaultTableColumnValuesCount(
			long companyId, String className, String columnName)
		throws SystemException {

		long classNameId = PortalUtil.getClassNameId(className);

		return expandoValueLocalService.getDefaultTableColumnValuesCount(
			companyId, classNameId, columnName);
	}

	public List<ExpandoValue> getRowValues(long rowId) throws SystemException {
		return expandoValuePersistence.findByRowId(rowId);
	}

	public List<ExpandoValue> getRowValues(long rowId, int start, int end)
		throws SystemException {

		return expandoValuePersistence.findByRowId(rowId, start, end);
	}

	public List<ExpandoValue> getRowValues(
			long companyId, long classNameId, String tableName, long classPK,
			int start, int end)
		throws SystemException {

		ExpandoTable table = expandoTablePersistence.fetchByC_C_N(
			companyId, classNameId, tableName);

		if (table == null) {
			return Collections.emptyList();
		}

		return expandoValuePersistence.findByT_CPK(
			table.getTableId(), classPK, start, end);
	}

	public List<ExpandoValue> getRowValues(
			long companyId, String className, String tableName, long classPK,
			int start, int end)
		throws SystemException {

		long classNameId = PortalUtil.getClassNameId(className);

		return expandoValueLocalService.getRowValues(
			companyId, classNameId, tableName, classPK, start, end);
	}

	public int getRowValuesCount(long rowId) throws SystemException {
		return expandoValuePersistence.countByRowId(rowId);
	}

	public int getRowValuesCount(
			long companyId, long classNameId, String tableName, long classPK)
		throws SystemException {

		ExpandoTable table = expandoTablePersistence.fetchByC_C_N(
			companyId, classNameId, tableName);

		if (table == null) {
			return 0;
		}

		return expandoValuePersistence.countByT_CPK(
			table.getTableId(), classPK);
	}

	public int getRowValuesCount(
			long companyId, String className, String tableName, long classPK)
		throws SystemException {

		long classNameId = PortalUtil.getClassNameId(className);

		return expandoValueLocalService.getRowValuesCount(
			companyId, classNameId, tableName, classPK);
	}

	public ExpandoValue getValue(long valueId)
		throws PortalException, SystemException {

		return expandoValuePersistence.findByPrimaryKey(valueId);
	}

	public ExpandoValue getValue(long columnId, long rowId)
		throws PortalException, SystemException {

		return expandoValuePersistence.findByC_R(columnId, rowId);
	}

	public ExpandoValue getValue(long tableId, long columnId, long classPK)
		throws SystemException {

		return expandoValuePersistence.fetchByT_C_C(tableId, columnId, classPK);
	}

	public ExpandoValue getValue(
			long companyId, long classNameId, String tableName,
			String columnName, long classPK)
		throws SystemException {

		ExpandoTable table = expandoTablePersistence.fetchByC_C_N(
			companyId, classNameId, tableName);

		if (table == null) {
			return null;
		}

		List<ExpandoColumn> columns = expandoColumnPersistence.findByT_N(
			table.getTableId(), columnName);

		if (columns.isEmpty()) {
			return null;
		}

		ExpandoColumn column = columns.get(0);

		return expandoValuePersistence.fetchByT_C_C(
			table.getTableId(), column.getColumnId(), classPK);
	}

	/**
	 * @deprecated {@link #getValue(long, long, String, String, long)}
	 */
	public ExpandoValue getValue(
			long classNameId, String tableName, String columnName, long classPK)
		throws SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getValue(
			companyId, classNameId, tableName, columnName, classPK);
	}

	public ExpandoValue getValue(
			long companyId, String className, String tableName,
			String columnName, long classPK)
		throws SystemException {

		long classNameId = PortalUtil.getClassNameId(className);

		return expandoValueLocalService.getValue(
			companyId, classNameId, tableName, columnName, classPK);
	}

	/**
	 * @deprecated {@link #getValue(long, String, String, String, long)}
	 */
	public ExpandoValue getValue(
			String className, String tableName, String columnName, long classPK)
		throws SystemException {

		long companyId = CompanyThreadLocal.getCompanyId();

		return expandoValueLocalService.getValue(
			companyId, className, tableName, columnName, classPK);
	}

	protected ExpandoValue doAddValue(
			long companyId, long classNameId, long tableId,
			long columnId, long classPK, String data)
		throws SystemException {

		ExpandoRow row = expandoRowPersistence.fetchByT_C(tableId, classPK);

		if (row == null) {
			long rowId = counterLocalService.increment();

			row = expandoRowPersistence.create(rowId);

			row.setCompanyId(companyId);
			row.setTableId(tableId);
			row.setClassPK(classPK);

			expandoRowPersistence.update(row, false);
		}

		ExpandoValue value = expandoValuePersistence.fetchByC_R(
			columnId, row.getRowId());

		if (value == null) {
			long valueId = counterLocalService.increment();

			value = expandoValuePersistence.create(valueId);

			value.setCompanyId(companyId);
			value.setTableId(tableId);
			value.setColumnId(columnId);
			value.setRowId(row.getRowId());
			value.setClassNameId(classNameId);
			value.setClassPK(classPK);
		}

		value.setData(data);

		expandoValuePersistence.update(value, false);

		return value;
	}

	protected Serializable doGetData(
			long companyId, String className, String tableName,
			String columnName, long classPK, ExpandoValue value, int type)
		throws PortalException, SystemException {

		if (type == ExpandoColumnConstants.BOOLEAN) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				value.getBoolean());
		}
		else if (type == ExpandoColumnConstants.BOOLEAN_ARRAY) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				new boolean[0]);
		}
		else if (type == ExpandoColumnConstants.DATE) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				value.getDate());
		}
		else if (type == ExpandoColumnConstants.DATE_ARRAY) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				new Date[0]);
		}
		else if (type == ExpandoColumnConstants.DOUBLE) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				value.getDouble());
		}
		else if (type == ExpandoColumnConstants.DOUBLE_ARRAY) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				new double[0]);
		}
		else if (type == ExpandoColumnConstants.FLOAT) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				value.getFloat());
		}
		else if (type == ExpandoColumnConstants.FLOAT_ARRAY) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				new float[0]);
		}
		else if (type == ExpandoColumnConstants.INTEGER) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				value.getInteger());
		}
		else if (type == ExpandoColumnConstants.INTEGER_ARRAY) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				new int[0]);
		}
		else if (type == ExpandoColumnConstants.LONG) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				value.getLong());
		}
		else if (type == ExpandoColumnConstants.LONG_ARRAY) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				new long[0]);
		}
		else if (type == ExpandoColumnConstants.SHORT) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				value.getShort());
		}
		else if (type == ExpandoColumnConstants.SHORT_ARRAY) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				new short[0]);
		}
		else if (type == ExpandoColumnConstants.STRING_ARRAY) {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				new String[0]);
		}
		else {
			return expandoValueLocalService.getData(
				companyId, className, tableName, columnName, classPK,
				value.getString());
		}
	}

}