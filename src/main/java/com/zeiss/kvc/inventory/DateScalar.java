package com.zeiss.kvc.inventory;

import com.netflix.graphql.dgs.DgsScalar;
import graphql.scalars.ExtendedScalars;
import graphql.schema.Coercing;
import graphql.schema.GraphQLScalarType;

@DgsScalar(name = "Date")
public class DateScalar implements Coercing {

    public static final GraphQLScalarType INSTANCE = ExtendedScalars.Date;
}