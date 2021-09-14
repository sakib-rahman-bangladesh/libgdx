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

public class btCollisionAlgorithmConstructionInfo extends BulletBase {
	private long swigCPtr;

	protected btCollisionAlgorithmConstructionInfo (final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}

	/** Construct a new btCollisionAlgorithmConstructionInfo, normally you should not need this constructor it's intended for
	 * low-level usage. */
	public btCollisionAlgorithmConstructionInfo (long cPtr, boolean cMemoryOwn) {
		this("btCollisionAlgorithmConstructionInfo", cPtr, cMemoryOwn);
		construct();
	}

	@Override
	protected void reset (long cPtr, boolean cMemoryOwn) {
		if (!destroyed) destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}

	public static long getCPtr (btCollisionAlgorithmConstructionInfo obj) {
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
				CollisionJNI.delete_btCollisionAlgorithmConstructionInfo(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	public btCollisionAlgorithmConstructionInfo () {
		this(CollisionJNI.new_btCollisionAlgorithmConstructionInfo__SWIG_0(), true);
	}

	public btCollisionAlgorithmConstructionInfo (btDispatcher dispatcher, int temp) {
		this(CollisionJNI.new_btCollisionAlgorithmConstructionInfo__SWIG_1(btDispatcher.getCPtr(dispatcher), dispatcher, temp),
			true);
	}

	public void setDispatcher1 (btDispatcher value) {
		CollisionJNI.btCollisionAlgorithmConstructionInfo_dispatcher1_set(swigCPtr, this, btDispatcher.getCPtr(value), value);
	}

	public btDispatcher getDispatcher1 () {
		long cPtr = CollisionJNI.btCollisionAlgorithmConstructionInfo_dispatcher1_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btDispatcher(cPtr, false);
	}

	public void setManifold (btPersistentManifold value) {
		CollisionJNI.btCollisionAlgorithmConstructionInfo_manifold_set(swigCPtr, this, btPersistentManifold.getCPtr(value), value);
	}

	public btPersistentManifold getManifold () {
		long cPtr = CollisionJNI.btCollisionAlgorithmConstructionInfo_manifold_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
	}

}
