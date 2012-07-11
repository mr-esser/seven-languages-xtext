/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.musicdb;

import com.mongodb.DBObject;
import org.xtext.mongobeans.examples.Duration;
import org.xtext.mongobeans.lib.IMongoBean;

public class Track implements IMongoBean {
  /**
   * Creates a new Track wrapping the given {@link DBObject}.
   */
  public Track(final DBObject dbObject) {
    this._dbObject = dbObject;
    
  }
  
  /**
   * Creates a new Track wrapping a new {@link com.mongodb.BasicDBObject}.
   */
  public Track() {
    _dbObject = new com.mongodb.BasicDBObject();
    _dbObject.put(JAVA_CLASS_KEY, "org.musicdb.Track");
    
  }
  
  private DBObject _dbObject;
  
  public DBObject getDbObject() {
    return this._dbObject;
  }
  
  public String getTitle() {
    return (java.lang.String) _dbObject.get("title");
    
  }
  
  public void setTitle(final String title) {
    _dbObject.put("title", title);
    
  }
  
  public int getSeconds() {
    return (java.lang.Integer) _dbObject.get("seconds");
    
  }
  
  public void setSeconds(final int seconds) {
    _dbObject.put("seconds", seconds);
    
  }
  
  public Duration getDuration() {
    int _seconds = this.getSeconds();
    Duration _duration = new Duration(_seconds);
    return _duration;
  }
}