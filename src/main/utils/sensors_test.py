import os
import json
import urllib2

print('hi')

data = {
    'ids': [12, 3, 4, 5, 6]
}

req = urllib2.Request('http://localhost:8080/sensors/stats')
req.add_header('Content-Type', 'application/json')

response = urllib2.urlopen(req, json.dumps(data))

print(response)