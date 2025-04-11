package com.zeiss.kvc.graphql;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.zeiss.kvc.inventory.TaskRepository;
import com.zeiss.kvc.inventory.Task;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DgsComponent
public class TasksDatafetcher {

  @Autowired
  private TaskRepository repository;

  @DgsData(
      parentType = "Query",
      field = "tasks"
  )
  public List<Task> getTasks(DataFetchingEnvironment dataFetchingEnvironment) {
    return repository.findAll();
  }
}
