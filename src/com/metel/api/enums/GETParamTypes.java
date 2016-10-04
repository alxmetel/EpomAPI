package com.metel.api.enums;

public enum GETParamTypes {
	RULE_IDS, //array of Rule identifier
	INCLUDE, //true if Rule should be included; false if Rule should be excluded
	OPERATOR, //AND/OR operator
	RULE_GROUP_ID, //identifier of Rule group
	ZONE_ID,
	PUBLISHING_CATEGORIES, //IDs of Inventory categories
	ID, //Site ID
	SITE_ID, //Site identifier
	TARGET_ID, //ID of the given Targeting
	OS_NAME, //the name of Operation System.
	COUNTRY_CODE, //ISO Country code. To pass multiple Country codes use: "UK, US, CA".
	REGION_NAME, //the given region name.
}
