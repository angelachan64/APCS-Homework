public boolean mixStart(String str) {
  if (str.length()<3){
    return false;
    }
  String factor = str.substring(1,3);
  if (factor.compareTo("ix")==0){
    return true;
    }
  else{
    return false;
    }
}
