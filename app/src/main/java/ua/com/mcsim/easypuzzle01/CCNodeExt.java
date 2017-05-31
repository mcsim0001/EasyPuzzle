package ua.com.mcsim.easypuzzle01;

/**
 * Created by mcsim on 30.05.2017.
 */

import org.cocos2d.nodes.CCNode;

public class CCNodeExt extends CCNode{
    public  String nodeText ;

    public CCNodeExt(){
        super();

    }

    public void setNodeText(String nText){
        this.nodeText = nText;
    }

    public String getNodeText(){
        return this.nodeText ;
    }

}
