package com.zeiss.kvc.graphql;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.zeiss.kvc.inventory.TasksProject;
import com.zeiss.kvc.inventory.TasksProjectRepository;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DgsComponent
public class ProjectsDatafetcher {
  @Autowired
  private TasksProjectRepository repository;
  @DgsData(
      parentType = "Query",
      field = "projects"
  )
  public List<TasksProject> getProjects(DataFetchingEnvironment dataFetchingEnvironment) {
    return repository.findAll();
  }
}
