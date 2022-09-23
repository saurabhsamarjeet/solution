import jenkins.model.Jenkins
import hudson.model.*

def version = readFile "${env.WORKSPACE}/version.txt"
   println "${version}"
def readcounter = version.split('\\.')
readcounter[2]= ++parseInt(readcounter[2])
def newversion=readcounter.join('.')
