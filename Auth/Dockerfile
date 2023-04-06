FROM node:15-alpine

WORKDIR /app

COPY package.json /app/

RUN npm install

COPY . /app
EXPOSE 4001
CMD [ "node", "index.js" ]