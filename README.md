# Moving a REST API to GraphQL API with DSG Framework

Step 1: generate a new project with following this documentation with spring initializr: https://netflix.github.io/dgs/generating-code-from-schema/

Step 2: write your graphql schema, since DSG is schema first

Step 3: run gradle bootRun and check the generated classes in dgs-codegen and dgs-codegen-generated-examples

Step 4: copy the data fetchers from the dgs-codegen-generated-examples into your main project package and add implementation

Step 5: go to localhost:8080/graphiql and execute the following queries: 
```
{
    tasks {
        id
        name
    }
}
```

```
{
    projects {
        id
        name
    }
}
```