package depedencymanagement.child.project2.controller;

import depedencymanagement.common.Entity.CommonEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project2")
public class Project2Controller {

    @GetMapping("/get-data")
    public ResponseEntity<CommonEntity> getData(@RequestParam String projectId){
        return new ResponseEntity<>(new CommonEntity(projectId), HttpStatus.OK);
    }
}
