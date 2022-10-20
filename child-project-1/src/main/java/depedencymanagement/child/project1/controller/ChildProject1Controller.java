package depedencymanagement.child.project1.controller;

import depedencymanagement.common.Entity.CommonEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/child-project-1")
@Slf4j
public class ChildProject1Controller {

    @GetMapping("/get-detail")
    public ResponseEntity<CommonEntity> getDetail(@RequestParam String id){
        System.out.println("hello");
        log.debug("request : "+id);
        return new ResponseEntity<>(new CommonEntity(id), HttpStatus.OK);
    }
}
