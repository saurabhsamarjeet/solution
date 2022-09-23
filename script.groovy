import jenkins.model.Jenkins
import hudson.model.*

def version = readFile "${env.WORKSPACE}/version.txt"
   println "${version}"
def readcounter = version.split('\\.')
readcounter[2]=(readcounter[2]).toInteger() +1
def newversion=readcounter.join('.')
println "${newversion}"
