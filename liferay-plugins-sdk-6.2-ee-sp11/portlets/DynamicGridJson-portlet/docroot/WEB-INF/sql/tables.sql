create table jqgrid_Invheader (
	invId LONG not null primary key,
	name VARCHAR(75) null,
	ammount LONG,
	tax LONG,
	total LONG,
	notes VARCHAR(75) null
);