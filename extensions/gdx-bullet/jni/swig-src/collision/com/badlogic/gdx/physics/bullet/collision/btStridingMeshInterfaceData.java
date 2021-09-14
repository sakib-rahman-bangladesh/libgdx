/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;

public class btStridingMeshInterfaceData extends BulletBase {
	private long swigCPtr;

	protected btStridingMeshInterfaceData (final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}

	/** Construct a new btStridingMeshInterfaceData, normally you should not need this constructor it's intended for low-level
	 * usage. */
	public btStridingMeshInterfaceData (long cPtr, boolean cMemoryOwn) {
		this("btStridingMeshInterfaceData", cPtr, cMemoryOwn);
		construct();
	}

	@Override
	protected void reset (long cPtr, boolean cMemoryOwn) {
		if (!destroyed) destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}

	public static long getCPtr (btStridingMeshInterfaceData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize () throws Throwable {
		if (!destroyed) destroy();
		super.finalize();
	}

	@Override
	protected synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btStridingMeshInterfaceData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	public void setMeshPartsPtr (btMeshPartData value) {
		CollisionJNI.btStridingMeshInterfaceData_meshPartsPtr_set(swigCPtr, this, btMeshPartData.getCPtr(value), value);
	}

	public btMeshPartData getMeshPartsPtr () {
		long cPtr = CollisionJNI.btStridingMeshInterfaceData_meshPartsPtr_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btMeshPartData(cPtr, false);
	}

	public void setScaling (btVector3FloatData value) {
		CollisionJNI.btStridingMeshInterfaceData_scaling_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
	}

	public btVector3FloatData getScaling () {
		long cPtr = CollisionJNI.btStridingMeshInterfaceData_scaling_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
	}

	public void setNumMeshParts (int value) {
		CollisionJNI.btStridingMeshInterfaceData_numMeshParts_set(swigCPtr, this, value);
	}

	public int getNumMeshParts () {
		return CollisionJNI.btStridingMeshInterfaceData_numMeshParts_get(swigCPtr, this);
	}

	public void setPadding (String value) {
		CollisionJNI.btStridingMeshInterfaceData_padding_set(swigCPtr, this, value);
	}

	public String getPadding () {
		return CollisionJNI.btStridingMeshInterfaceData_padding_get(swigCPtr, this);
	}

	public btStridingMeshInterfaceData () {
		this(CollisionJNI.new_btStridingMeshInterfaceData(), true);
	}

}
