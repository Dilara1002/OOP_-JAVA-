public class MaterStudent extends Student implements ConferanceScoreBehaviour{
    int numberOfConf;
    MaterStudent(int id,float mid,float fin,int numberOfConf){
        super(id,mid,fin);
        this.numberOfConf=numberOfConf;
    }
    @Override
     float computeTotalScore(){

    }
    @Override
    float computeBaseScore(){

    }
}
