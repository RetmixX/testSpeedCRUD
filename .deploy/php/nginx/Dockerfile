FROM nginx:1.23-alpine

COPY ./.deploy/php/nginx/conf.d/default.conf /etc/nginx/conf.d/default.conf
COPY ./php /project

CMD ["nginx", "-g", "daemon off;"]