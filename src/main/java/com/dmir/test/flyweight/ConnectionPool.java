package com.dmir.test.flyweight;

import java.sql.Connection;
import java.util.Vector;

/**
 * Created by $wally on 2016/9/19.
 */
public class ConnectionPool {
    private static ConnectionPool connectionPool=new ConnectionPool();
    private  Vector<Connection> pool=new Vector<Connection>();
    final  int MAX=100;

    /**
     * 初始化连接池
     */
    private ConnectionPool(){
        for(int i=0;i<MAX;++i){
            pool.add(null);
        }
    }

    public static synchronized  ConnectionPool getInstance(){
        return connectionPool;
    }

    public  synchronized void release(Connection connection){
        pool.add(connection);
    }

    public  synchronized Connection getConnection(){
        if(pool.size()>0){
            Connection connection=pool.get(0);
            pool.remove(connection);
            return connection;
        }
        return null;
    }
}
