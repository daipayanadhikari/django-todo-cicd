def buildApp(){
    echo 'Building The Application...'
}

def testApp(){
    echo 'Testing The Application...'
}

def deployApp(){
    echo 'Deploying The Application...'
    echo "Deploying Applicatio Version ${params.VERSION}"
}

return this
