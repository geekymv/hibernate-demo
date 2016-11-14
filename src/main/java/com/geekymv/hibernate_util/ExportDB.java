package com.geekymv.hibernate_util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
/**
 * 将hbm生成ddl
 * 
 * @desc: hibernate-demo
 * @author: miying
 * @createTime: 2016年11月10日 下午1:36:48
 * @history:
 * @version: v1.0
 */
public class ExportDB {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();

		SchemaExport export = new SchemaExport(configuration);
		export.create(true, true);

	}

}
