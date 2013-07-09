/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.modules.titanium.map;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;

import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;


@Kroll.module(name="Map", id="ti.map")
public class MapModule extends KrollModule
{
	public static final String PROPERTY_DRAGGABLE = "draggable";
	public static final String PROPERTY_POINTS = "points";
	public static final String PROPERTY_TRAFFIC = "traffic";
	public static final String PROPERTY_MAP = "map";
	public static final String PROPERTY_NEWSTATE = "newState";
	public static final String PROPERTY_CUSTOM_VIEW = "customView";
	public static final String PROPERTY_PIN = "pin";
	public static final String PROPERTY_INFO_WINDOW = "infoWindow";
	public static final String PROPERTY_LEFT_PANE = "leftPane";
	public static final String PROPERTY_RIGHT_PANE = "rightPane";
	public static final String PROPERTY_USER_LOCATION_BUTTON = "userLocationButton";
	public static final String EVENT_PIN_CHANGE_DRAG_STATE = "pinchangedragstate";
	
	@Kroll.constant public static final int NORMAL_TYPE = GoogleMap.MAP_TYPE_NORMAL;
	@Kroll.constant public static final int TERRAIN_TYPE = GoogleMap.MAP_TYPE_TERRAIN;
	@Kroll.constant public static final int SATELLITE_TYPE = GoogleMap.MAP_TYPE_SATELLITE;
	@Kroll.constant public static final int HYBRID_TYPE = GoogleMap.MAP_TYPE_HYBRID;
	@Kroll.constant public static final int ANNOTATION_DRAG_STATE_START = 0;
	@Kroll.constant public static final int ANNOTATION_DRAG_STATE_END = 1;

	@Kroll.constant public static final int SUCCESS = 0;
	@Kroll.constant public static final int SERVICE_MISSING = 1;
	@Kroll.constant public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
	@Kroll.constant public static final int SERVICE_DISABLED = 3;
	@Kroll.constant public static final int SERVICE_INVALID = 9;
	
	@Kroll.constant public static final float ANNOTATION_AZURE = BitmapDescriptorFactory.HUE_AZURE;
	@Kroll.constant public static final float ANNOTATION_BLUE = BitmapDescriptorFactory.HUE_BLUE;
	@Kroll.constant public static final float ANNOTATION_CYAN = BitmapDescriptorFactory.HUE_CYAN;
	@Kroll.constant public static final float ANNOTATION_GREEN = BitmapDescriptorFactory.HUE_GREEN;
	@Kroll.constant public static final float ANNOTATION_MAGENTA = BitmapDescriptorFactory.HUE_MAGENTA;
	@Kroll.constant public static final float ANNOTATION_ORANGE = BitmapDescriptorFactory.HUE_ORANGE;
	@Kroll.constant public static final float ANNOTATION_RED = BitmapDescriptorFactory.HUE_RED;
	@Kroll.constant public static final float ANNOTATION_ROSE = BitmapDescriptorFactory.HUE_ROSE;
	@Kroll.constant public static final float ANNOTATION_VIOLET = BitmapDescriptorFactory.HUE_VIOLET;
	@Kroll.constant public static final float ANNOTATION_YELLOW = BitmapDescriptorFactory.HUE_YELLOW;
	
	public MapModule()
	{
		super();
	}

	@Kroll.method
	public int isGooglePlayServicesAvailable() {
		return GooglePlayServicesUtil.isGooglePlayServicesAvailable(TiApplication.getAppRootOrCurrentActivity());
	}
}

